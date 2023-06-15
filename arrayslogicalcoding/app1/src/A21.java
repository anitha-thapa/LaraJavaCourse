class A21
{
	public static void main(String[] args) 
	{
		int[] array = {1, 5, 2, 6, 9, 1, 0, 3, 4, 5};
		//			   0  1  2  3  4  5  6  7  8  9 //index number
		int sum = 0;
		for(int i = array.length/2 ; i < array.length ; i ++)
		{
			sum += array[i];
		}
		double avg = (double) sum / (array.length/2);
			System.out.println("avg:" + avg);
		
		}

	}

/* avg:2.6 */