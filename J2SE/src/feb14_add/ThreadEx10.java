package feb14_add;

public class ThreadEx10 {
	
	
	public static void main(String[] args){
		
		
		ThreadGroup main = Thread.currentThread().getThreadGroup();
		ThreadGroup grp1 = new ThreadGroup("Group1");
		ThreadGroup grp2 = new ThreadGroup("Group2");
		
		// threadGroup(ThreadGroup parent,String name)
		ThreadGroup subGrp1 = new ThreadGroup(grp1,"SubGroup1");
		
		grp1.setMaxPriority(3); // 쓰레드 그룹 grp1의 최대우선순위를 3으로 변경
		
		//Thread(ThreadGroup,tg,String name);
		Thread th1 = new Thread(grp1,"th1");
		
		//Thread(ThreadGroup,tg,String name);
		Thread th2 = new Thread(grp1,"th2");
		
		//Thread(ThreadGroup,tg,String name);
		Thread th3 = new Thread(grp2,"th3");
		
		th1.start();
		th2.start();
		th3.start();
		
		System.out.println(">>List of ThreadGroup : "+ main.getName() 
		   +", Active ThreadGroup: " + main.activeGroupCount()
		   +", Active Thread: " + main.activeCount());
		
		main.list();		
		
	}

}
/*  결과
>>List of ThreadGroup : main, Active ThreadGroup: 3, Active Thread: 4
java.lang.ThreadGroup[name=main,maxpri=10]
    Thread[main,5,main]
    java.lang.ThreadGroup[name=Group1,maxpri=3]
        Thread[th1,3,Group1]
        Thread[th2,3,Group1]
        java.lang.ThreadGroup[name=SubGroup1,maxpri=3]
    java.lang.ThreadGroup[name=Group2,maxpri=10]
        Thread[th3,5,Group2]




*/