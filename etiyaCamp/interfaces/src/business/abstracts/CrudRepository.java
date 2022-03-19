package business.abstracts;

public interface CrudRepository {
	 void add() ;
	
	 void list() ;
	
	 void update() ;
	
	 void remove();
}

//interfaceler sadece imza tutar. 
//default publictir yazmaya gerek yok.
// public void add(){sysout("demo")} 
//yularýdaki kodda sysout kýsmý interfacelerde yazýlmaz.
// sadece void add(); gibi imzalar yazýlýr.