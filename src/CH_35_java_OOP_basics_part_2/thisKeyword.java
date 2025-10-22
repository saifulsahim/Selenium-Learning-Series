package CH_35_java_OOP_basics_part_2;

public class thisKeyword {
		int a = 2;

		public void getData()
		{
		    int a = 3;
		    System.out.println(a);
		    System.out.println(this.a);
		    // this refers to current object - object scope lies in class level
		}

		public static void main(String[] args) {
		    // TODO Auto-generated method stub
			thisKeyword td = new thisKeyword();
		    td.getData();
		}

}
