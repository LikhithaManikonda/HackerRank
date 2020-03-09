import java.math.*;
class ConsumerThread extends Thread 
{
    UserQueue queueObj;
    ConsumerThread(UserQueue queueObj) 
    {
        this.queueObj = queueObj;
    }
	public void run() 
    {
		//To check both threads are accessing same queueObj
        System.out.println(queueObj);
        synchronized(queueObj) 
        {
            if(this == null)
            {
            	try {    
            		queueObj.wait();  
            	}
            	catch(InterruptedException ie) {
                System.out.println("InterruptedException");
            	}
            }
            else 
            {
            System.out.println(queueObj.number);
            }
        }
    }     
}
class ProducerThread extends Thread 
{
    UserQueue queueObj;
    ProducerThread(UserQueue queueObj)
    {
        this.queueObj = queueObj;
    }
    public void run() 
    {
        System.out.println(queueObj);
        synchronized(queueObj)
        {
        queueObj.setNumber(10);
        queueObj.notify();
        }
    }
}
class UserQueue 
{
int number;
void setNumber(int number)
{
this.number = number;
}
}
class ProducerConsumerProblemMultiThreading 
{
public static void main(String[] args)
{
UserQueue q = new UserQueue();
ProducerThread pt = new ProducerThread(q);
ConsumerThread ct = new ConsumerThread(q);
pt.start();
ct.start();
System.out.println("Main Thread");
}
BigDecimal bd;

}
