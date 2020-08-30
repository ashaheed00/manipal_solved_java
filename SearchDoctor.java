package ok;

//IMPORT STATEMENTS HERE 
import java.util.*;

class Doctor implements Comparable<Doctor> {
	private String name;
	private String speciality;
	private int experience;

	Doctor(String name, String speciality, int experience) {
		this.name = name;
		this.speciality = speciality;
		this.experience = experience;
	}

//CODE HERE 
	public void setName(String name) {
		this.name = name;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality; // 9733851306
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getName() {
		return this.name;
	}

	public String getSpeciality() {
		return this.speciality;
	}

	public int getExperience() {
		return this.experience;
	}

	@Override
	public String toString() {
		return name + " " + speciality + " " + experience + "\n";
	}

	@Override
	public int compareTo(Doctor doc) {
		int result = speciality.compareTo(doc.speciality);
		if (result == 0) {
			result = Integer.compare(doc.getExperience(), experience);
		}
		return result;
	}
}

class DoctorService {
	// DONT MODIFY THIS
	private List<Doctor> doctorsRepository;

	// DONT MODIFY THIS
	public DoctorService(List<Doctor> doctorsRepository) {
		this.doctorsRepository = doctorsRepository;
	}

	// CODE HERE
	public List<Doctor> getExperiencedDoctors(int n) {
		List<Doctor> docList = new ArrayList<>();
		for (Doctor doc : this.doctorsRepository) {
			if (doc.getExperience() >= n) {
				docList.add(doc);
			}
		}
		Collections.sort(docList);
		return docList;
	}

	public Set<Doctor> getSpecialityDoctor(String speciality) {
		Comparator<Doctor> nameComparator = Comparator.comparing(Doctor::getName);
		Set<Doctor> setOfDoctors = new TreeSet<>(nameComparator);
		for (Doctor doc : this.doctorsRepository) {
			String spec = doc.getSpeciality();
			if (spec.equalsIgnoreCase(speciality)) {
				setOfDoctors.add(doc);
			}
		}
		return setOfDoctors;
	}
}

public class SearchDoctor { // DON'T MODIFY THIS
	private static String doctorsData;
	// DON'T MODIFY THIS
	static {
		StringBuilder doctors = new StringBuilder();
		doctors.append("Amy-Pediatrics-16;");
		doctors.append("John-Dermatology-10;");
		doctors.append("David-Dermatology-15;");
		doctors.append("Bob-Pediatrics-6;");
		doctors.append("Cathy-Dermatology-5;");
		doctors.append("Mavis-Pediatrics-11;");
		doctors.append("Robin-Pediatrics-7;");
		doctors.append("Minty-Dermatology-9;");
		doctors.append("Jim-Cardiology-25;");
		doctorsData = doctors.toString();
	}

	public static void main(String[] args) {
		// CODE HERE
		List<Doctor> doctorList = new ArrayList<>();
		String[] docData = doctorsData.split(";");
		for (String doctor : docData) {
			String[] temp = doctor.split("-");
			Doctor doc = new Doctor(temp[0], temp[1], Integer.valueOf(temp[2]));
			doc.setName(temp[0]);
			doc.setSpeciality(temp[1]);
			doc.setExperience(Integer.valueOf(temp[2]));
			doctorList.add(doc);
		}
		DoctorService docService = new DoctorService(doctorList);
		Scanner sc = new Scanner(System.in);
		int choiceOpt1 = sc.nextInt();
		if (choiceOpt1 == 1) {
			int choiceOpt2 = sc.nextInt();
			List<Doctor> dList = docService.getExperiencedDoctors(choiceOpt2);
			if (dList.isEmpty()) {
				System.out.println("No Doctors Found");
			} else {
				dList.forEach(s -> System.out.println(s));
			}
		} else if (choiceOpt1 == 2) {
			String choiceOpt2 = sc.next();
			Set<Doctor> dList = docService.getSpecialityDoctor(choiceOpt2);
			if (dList.isEmpty()) {
				System.out.println("No Doctors Found");
			} else {
				dList.forEach(s -> System.out.println(s));
			}
		} else {
			System.out.println("Invalid Choice");
		}
	}
}
