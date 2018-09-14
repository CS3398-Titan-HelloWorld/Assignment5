package src;


public class Manager {
	BaseWorker worker;

	public void Manager() {

	}
	public void setWorker(Worker w) {
		worker=w;
	}

	public void manage() {
		worker.work();
	}

}
