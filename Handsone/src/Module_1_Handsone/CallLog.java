package Module_1_Handsone;

import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CallLog {
	private List<Call> callList;

	public CallLog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CallLog(List<Call> callList) {
		super();
		this.callList = callList;
	}

	public List<Call> getCallList() {
		return callList;
	}

	public void setCallList(List<Call> callList) {
		this.callList = callList;
	}

	@Override
	public String toString() {
		return "CallLog [callList=" + callList + "]";
	}
	
	public Contact getFavouriteContact() throws ParseException {
		
		Map<Contact, Integer> map=new LinkedHashMap<Contact, Integer>();
		for(Call call : callList)
		{
			Contact contact = call.getContact();
			//check if this contact already present in the map
			Integer count = map.get(contact);	//equals should be overriden
			if(count==null)
				count=0;
			count++;
			map.put(contact, count);
		}
		//find the largest count in the map
		int max=0;
		Contact maxContact=null;
		for(Entry<Contact, Integer> e:map.entrySet())
		{
			int count=e.getValue();
			if(count>max)
			{
				max=count;
				maxContact=e.getKey();
			}
		}
		return maxContact;
		
		
	}

}
