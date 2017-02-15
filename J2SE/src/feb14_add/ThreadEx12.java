package feb14_add;

import java.util.*;
import static java.lang.System.out;

public class ThreadEx12 {
	
	public static void main(String[] args) throws Exception{
		
		ThreadEx12_1 t1 = new ThreadEx12_1("thread1");
		ThreadEx12_2 t2 = new ThreadEx12_2("Thread2");
		t1.start();
		t2.start();
		
		
	}

}


class ThreadEx12_1 extends Thread{

	ThreadEx12_1(String name){
		super(name);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		try {
			sleep(5 * 1000);	// 5초 동안 기다린다.
		} catch(InterruptedException e) {}
	}	
	
	
	
	
}

class ThreadEx12_2 extends Thread{
	
	ThreadEx12_2(String name){
		super(name);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		
		Map map = getAllStackTraces();
		
		Iterator it = map.keySet().iterator();
		
		int x=0;
		
		while(it.hasNext()){
			Object obj = it.next();
			
			Thread t = (Thread)(obj);
			
			StackTraceElement[] ste = (StackTraceElement[])(map.get(obj));
			
			
			out.println( "["+ ++x + "] name : " + t.getName() 
			+ ", group : " + t.getThreadGroup().getName() 
			+ ", daemon : " + t.isDaemon());

			
			for(int i=0; i<ste.length; i++){
				out.println(ste[i]);
			}
			
			System.out.println();
		}
				
	}
	
	
}


/*
[1] name : Signal Dispatcher, group : system, daemon : true

[2] name : DestroyJavaVM, group : main, daemon : false

[3] name : Finalizer, group : system, daemon : true
java.lang.Object.wait(Native Method)
java.lang.ref.ReferenceQueue.remove(Unknown Source)
java.lang.ref.ReferenceQueue.remove(Unknown Source)
java.lang.ref.Finalizer$FinalizerThread.run(Unknown Source)

[4] name : Thread2, group : main, daemon : false
java.lang.Thread.dumpThreads(Native Method)
java.lang.Thread.getAllStackTraces(Unknown Source)
feb14_add.ThreadEx12_2.run(ThreadEx12.java:51)

[5] name : Reference Handler, group : system, daemon : true
java.lang.Object.wait(Native Method)
java.lang.Object.wait(Unknown Source)
java.lang.ref.Reference.tryHandlePending(Unknown Source)
java.lang.ref.Reference$ReferenceHandler.run(Unknown Source)

[6] name : Attach Listener, group : system, daemon : true

[7] name : thread1, group : main, daemon : false
java.lang.Thread.sleep(Native Method)
feb14_add.ThreadEx12_1.run(ThreadEx12.java:31)


 * 
 */

