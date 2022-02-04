package lovely;

import java.util.ArrayList;
import java.util.List;

public class Account {
String type;
List l;
public Account() {
	this.type = "Account";
	List l=new ArrayList<>();
	l.add(22);
	l.add(23);
	l.add(24);
	this.l = l;
}
public String getType() {
	return type;
}
public List getL() {
	return l;
}

}
