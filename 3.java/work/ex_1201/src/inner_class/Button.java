package inner_class;

public class Button {

	interface OnClickListener{
		void onClick();
	}
	
	private OnClickListener onClickListener;
	
	void setOnClickListener(OnClickListener listener) {
		this.onClickListener = listener;
	}
	
	public void click() {
		onClickListener.onClick();
	}
}
