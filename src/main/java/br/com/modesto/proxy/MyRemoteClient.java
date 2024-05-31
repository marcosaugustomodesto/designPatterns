package br.com.modesto.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MyRemoteClient {
	public static void main(String[] args) {
       new MyRemoteClient().go();
	}

	private void go() {
		try {
			MyRemote myRemote = (MyRemote) Naming.lookup("rmi://127.0.0.1/MyRemote");
			System.out.println(myRemote.sayHello());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
