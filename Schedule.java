
public class Schedule {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int class_number = 10;
		Class[] classes = new Class[class_number];
		
		for(int i = 0; i < class_number; i++)
		{
			classes[i].number = i;
		}
		
		classes[0].class_name = "AP Computer Science";
		classes[1].class_name = "Advanced Java";
		classes[2].class_name = "Intro to Java";
		classes[0].prerecscount = 2;
		classes[1].prerecscount = 1;
		classes[0].prerecs[0] = 1;
		classes[0].prerecs[1] = 2;
		classes[1].prerecs[0] = 2;
		
		while (classes[0].added == false || classes[1].added == false || classes[2].added == false || classes[3].added == false || classes[4].added == false ||
				classes[5].added == false || classes[6].added == false || classes[7].added == false || classes[8].added == false || classes[9].added == false )
		{
			for (int i = 0; i < class_number; i++)
			{
				if (classes[i].added == false)
				{
					if (classes[i].prerecscount > 0)
					{
						int k = 0;
						for(int j = 0; j < classes[i].prerecscount; j++)
						{
							if (classes[classes[i].prerecs[j]].added == false)
								k++;
						}
						if (k > 0)
						{
							classes[i].addclass();
						}
						else 
							break;
							
					}
					else
						classes[i].addclass();
				}
				else
					continue;
			}
		}
	}
	

}
