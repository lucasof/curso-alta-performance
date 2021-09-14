

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TestesU {
	public boolean verificaSoma (int[] array, int k){
		for(int cont=0; cont < array.length; cont++){
			for(int cont2 = (cont + 1); cont2 < array.length; cont2++){
				if(array[cont] + array[cont2] == k){
					return true;
				}		
			}
		}	
		return false;
	} 
	
	public boolean verificaSomaDif (int[] nums, int target) {
		
        Map<Integer, Integer> numMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
        	
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return true;
            } else {
                numMap.put(nums[i], i);
            }
        }
        return false;
    }
	@Test
	public void verificaSoma() {
		
		int[] lista = {1,4,9,20,20,8,8,9,10,28,45,98,5,98};
		
		boolean real = verificaSomaDif(lista, 43);
		
		assertEquals(true, real);
	}
	
}
