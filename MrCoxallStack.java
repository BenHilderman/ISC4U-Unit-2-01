import java.util.ArrayList;
import java.util.List;


public class MrCoxallStack {
    // this class implements a stack object
	
    // the stack will actually be held in a List
    private List _theStackList = new ArrayList();
	
    public void push(String valueToPutOnStack) {
        // push method adds an item to the stack
		
        _theStackList.add(valueToPutOnStack);
        System.out.println(_theStackList);
    }
}