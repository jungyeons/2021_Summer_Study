
public class main {

	public static void main(String[] args) {
		Car car = new Car();
		car.color = "빨강";
		car.name = "람보르기니";
		car.number = 1;
		
		
        Bus bus = new Bus();
        bus.color = "연두";
        bus.money = "1200원";
        bus.number = 4444;
        
        Otobai otobai = new Otobai();
        otobai.color ="초록";
        otobai.name = "부릉";
        otobai.number = 3;
        
        car.move();
        otobai.sleep();

}
}
