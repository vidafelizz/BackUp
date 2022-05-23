package ch11;

public interface RemoteControllable extends Controllable {
	// interface끼리는 extends로 상속 가능
	void remoteOn();
	void remoteOff();
}
