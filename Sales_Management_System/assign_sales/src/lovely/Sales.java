package lovely;

import java.util.ArrayList;
import java.util.List;

public class Sales {
String type;
List l;
public Sales() {
	this.type = "Sales";
	List l=new ArrayList<>();
	l.add(25);
	l.add(26);
	l.add(27);
	this.l = l;
}
public String getType() {
	return type;
}
public List getL() {
	return l;
}

}
