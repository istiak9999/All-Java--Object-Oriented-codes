import java.util.Scanner;

import com.sun.source.tree.ParameterizedTypeTree;
import com.sun.tools.classfile.Opcode.Set;
import com.sun.tools.sjavac.comp.dependencies.PublicApiCollector;

import jdk.jshell.PersistentSnippet;
import jdk.nashorn.internal.codegen.CompilerConstants.Call;



public class Hospital extends Patient implements Increase,Decrease{
Scanner sc = new Scanner(System.in);

public static int total_bed=100;

public static int getTotal_bed() {
	return total_bed;
}



@Override
	public void IncreaseBed() {
	int n=10;
	System.out.println("How many beds Increased:");
	n= sc.nextInt();
 total_bed=total_bed+n;
	}

@Override
public void DecreaseBed() {

total_bed=total_bed-1;
	
}

	
}

