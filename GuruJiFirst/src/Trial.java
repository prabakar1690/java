import java.util.*;

public class Trial {
int id;
String name;
void get_data(int n1,String n2){
id=n1;
name=n2;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Trial obj1=new Trial();
Trial obj2=new Trial();
obj1.get_data(10, "rajan");
obj2.get_data(10, "rajan");
Map<String,Trial> m2=new HashMap<String,Trial>();
m2.put("1", obj1);
m2.put("2", obj2);
System.out.println(m2);
	}

}
