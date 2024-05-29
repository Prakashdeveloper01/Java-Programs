class Van {
int no;
String name;
Speed speed;

Van(int no, String name, Speed speed) {
this.no = no;
this.name = name;
this.speed = speed;
}

void display() {
System.out.println("Vehicle: " + no + " " + name);
System.out.println("Speed: " + speed.speed + ", Gear: " + speed.gear);
}

public static void main(String args[]) {
Speed s1 = new Speed(38, 5);
Speed s2 = new Speed(40, 6);
Van v1 = new Van(1011, "Tata", s1);
Van v2 = new Van(1012, "car", s2);
v1.display();
v2.display();
}
}
