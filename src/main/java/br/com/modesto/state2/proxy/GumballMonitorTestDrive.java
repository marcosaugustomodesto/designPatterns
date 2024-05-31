package br.com.modesto.state2.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class GumballMonitorTestDrive {

	public static void main(String[] args) throws RemoteException {
		String[] location = { "rmi://santafe.mightygumball.com/gumballmachine",
				"rmi://boulder.mightygumball.com/gumballmachine", "rmi://austin.mightygumball.com/gumballmachine" };

		GumballMonitor[] monitor = new GumballMonitor[location.length];
		for (int i = 0; i < location.length; i++) {
			GumballMachineRemote gumballMachine;
			try {
				gumballMachine = (GumballMachineRemote) Naming.lookup(location[i]);
				monitor[i] = new GumballMonitor(gumballMachine);
				System.out.println(monitor[i]);

			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (RemoteException e) {
				e.printStackTrace();
			} catch (NotBoundException e) {
				e.printStackTrace();
			}
		}

		for (int i = 0; i < monitor.length; i++) {
			monitor[i].report();
		}
	}
}
