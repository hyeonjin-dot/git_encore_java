import com.encore.tv.domain.LgTV;
import com.encore.tv.domain.SamsungTV;
import com.encore.tv.factory.TvBeanFactory;
import com.encore.tv.util.TV;


public class TvClientMain {

	public static void main(String[] args) {
//		SamsungTV tv = new SamsungTV(); // 결합도가 강함 -> 다른 객체를 사용하고 싶으면 다른 객체를 생성해야함
//		tv.powerOn();
//		LgTV tv = new LgTV();
//		tv.turnOn();
//		TV tv = new SamsungTV();
//		tv.turnOn();
		
		TvBeanFactory factory = TvBeanFactory.getInsatnce();
		TV tv = factory.getBean("samsung");
		tv.turnOn();
	}

}