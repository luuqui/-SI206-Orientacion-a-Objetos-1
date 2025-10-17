package unlp.ejercicio18_set;

import java.util.HashSet;

public class EvenNumberSetExtend extends HashSet<Integer>{
	
	@Override
	public boolean add(Integer n){
		if(n % 2 == 0) {
			return super.add(n);
		}
		return false;
	}
}
