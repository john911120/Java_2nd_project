package ex_nested_interface;

import ex_nested_interface.Button.OnClickListener;

public class MessageListener implements OnClickListener {

	@Override
	public void onClick() {
		System.out.println("메세지를 보낸다.");
	}

}
