package br.com.modesto.state2.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class GumballMachineTestDrive {

	public static void main(String[] args) throws RemoteException {
		int count = 0;
		GumballMachineRemote gumballMachine = null;
		if (args.length < 2) {
			System.out.println("GumballMonitor <Name> <Inventory>");
			System.exit(1);
		}

		try {
			count = Integer.parseInt(args[1]);
			gumballMachine = new GumballMachine(args[0], count);
			Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
