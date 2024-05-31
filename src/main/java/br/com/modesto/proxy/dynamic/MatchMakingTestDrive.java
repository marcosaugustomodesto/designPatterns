package br.com.modesto.proxy.dynamic;

import java.lang.reflect.Proxy;

public class MatchMakingTestDrive {
	public static void main(String[] args) {
		new MatchMakingTestDrive().drive();
	}

	private void drive() {
		Person joe = getPersonFromDataBase("Joe Javabeans");
		Person ownerProxy = getOwnerProxy(joe);
		System.out.println("Name is " + ownerProxy.getName());
		ownerProxy.setInterests("bowling, Go");
		System.out.println("Interests set from owner proxy");
		try {
			ownerProxy.setRating(10);
		} catch (Exception e) {
			System.out.println("Can't set rating from owner proxy");
		}
		System.out.println("Rating is " + ownerProxy.getRating());

		Person noownerProxy = getNoOwnerProxy(joe);
		System.out.println("Name is " + noownerProxy.getName());
		try {
			noownerProxy.setInterests("bowling, Go");
		} catch (Exception e) {
			System.out.println("Can't set Interests from non owner proxy");
		}
		noownerProxy.setRating(3);
		System.out.println("Rating set from non owner proxy");
		System.out.println("Rating is " + ownerProxy.getRating());

	}

	private Person getOwnerProxy(Person person) {
		return (Person) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(),
				new OwnerInvocationHandler(person));
	}

	private Person getNoOwnerProxy(Person person) {
		return (Person) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(),
				new NoOwnerInvocationHandler(person));
	}

	private Person getPersonFromDataBase(String string) {
		Person joe = new PersonImpl();
		joe.setGender("M");
		joe.setInterests("Bowling, GO");
		joe.setName("Joe Javabeans");
		joe.setRating(0);
		return joe;
	}
}
