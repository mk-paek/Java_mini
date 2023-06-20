package test;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Message> mq = new LinkedList<>();
		
		mq.offer(new Message("sendMail", "이진우"));
		mq.offer(new Message("sendSMS", "전아연"));
		mq.offer(new Message("sendKaTalk", "김선아"));
		
		while(!mq.isEmpty()) {
			Message message = mq.poll();
			switch(message.command) {
			case "sendMail" :
				System.out.println(message.to + " 님에게 메일을 보냅니다.");
				break;
			case "sendSMS" :
				System.out.println(message.to + " 님에게 SMS을 보냅니다.");
				break;
			case "sendKaTalk" :
				System.out.println(message.to + " 님에게 톡을 보냅니다.");
				break;
			}
		}
	}

}
