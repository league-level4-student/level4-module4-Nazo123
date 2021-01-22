package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	private List<Patient> patients = new ArrayList<Patient>();
	Doctor(){
		
	}
	
	public List<Patient> getPatients() {
		return patients;
	}

	public void assignPatient(Patient patient) throws DoctorFullException{
		if(patients.size() >= 3) {
			throw new DoctorFullException();
		}
		else {
		patients.add(patient);
		}
	}

	public boolean performsSurgery() {
		return false;
		
	}
	public boolean makesHouseCalls() {
		return false;	
	}

	public void doMedicine() {
	for(int i = 0; i < patients.size();i++) {
		patients.get(i).checkPulse();
	}
	}
}
