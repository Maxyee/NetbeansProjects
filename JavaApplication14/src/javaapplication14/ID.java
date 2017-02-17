import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;
class ID
{
    static private int serialNo=0;
	private String id;
	static public DecimalFormat df=new DecimalFormat("00000");
	SimpleDateFormat formeter=new SimpleDateFormat("yyyy-MM");
	Date currentDate;
	ID()
	{
		serialNo++;
		currentDate=new Date();			
		id=formeter.format(currentDate)+"-"+df.format(serialNo);
	}
	
	public String getID()
	{
		return id;
	}
}