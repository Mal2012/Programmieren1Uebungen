package ampel;

public class Ampel {
int status;

public Ampel(int i){
	this.status=i;
}

public Ampel(){
	this.status=00;
}

public void umschalten(){
	if(status==0){
		status=1;
	}else if(status==1){
		status=10;
	}else if(status==10){
		status=11;
	}else if(status==11){
		status=0;
	}
}

@Override
public String toString() {
	return "Ampel [status=" + status + "]";
}



}
