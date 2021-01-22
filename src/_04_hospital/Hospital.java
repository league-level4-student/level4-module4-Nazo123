package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	private List<Doctor> doctors = new ArrayList<Doctor>();
	private List<Patient> patients = new ArrayList<Patient>();

	public void addDoctor(GeneralPractitioner generalPractitioner) {
		doctors.add(generalPractitioner);
	}

	public void addDoctor(Surgeon surgeon) {
		doctors.add(surgeon);

	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void addPatient(Patient patient) {
		patients.add(patient);
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void assignPatientsToDoctors() {
		int patient = 0;
		for (int i = 0; i < doctors.size(); i++) {
			try {
				for (; patient < patients.size(); patient++) {
					doctors.get(i).assignPatient(patients.get(patient));
				}
			} catch (DoctorFullException e) {
				System.out.println("Doctor " + (i + 1) + " is full");
			}

		}
	}

}
