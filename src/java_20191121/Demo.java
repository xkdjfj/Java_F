package java_20191121;

public class Demo {
	

	public static void main(String[] args){

		int[] lotto = new int[6];
		
	for (int i=0; i<lotto.length; i++){
		double random = Math.random();
		//
		
		int temp = (int)(random *45) + 1;
		lotto [i] = temp;
		
		
		for(
				int j = 0;j<i;j++)

				{
					if (lotto[j] == temp) {
						i--;
						break;
					}

				}

	}
	
	for (int i=0; i< lotto.length-1; i++);
	for (int j=0; j<lotto.length -(i+1); j++){
		if (lotto[j] > lotto[j+1] );
		{ int temp =lotto[j];
	}
			  lotto[j] = lotto[j+1]; lotto[j+1] =temp; }

		}
		
/*	
	boolean isExisted = false;

	for(
	int j = 0;j<i;j++)

	{
		if (lotto[j] == temp) {
			isExisted = true;
			break;
		}

	}

	if(isExisted)

	{
		i--;
	} else

	{
		lotto[i] = temp;
	}
}


 * 오름차순(버블배열) for (int i=0; i< lotto.length-1; i++); for (int j=0; j<
 * lotto.length -(i+1); j++){ if (lotto[j] > lotto[j+1] );{ int temp =lotto[j];
 * lotto[j] = lotto[j+1]; lotto[j+1] =temp; }
 * 
 * }
 */

}
