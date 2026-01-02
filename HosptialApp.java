package com.hospital;

import java.util.Scanner;

public class HospitalApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {

            System.out.println("\n=================================");
            System.out.println("  HOSPITAL PATIENT RECORD SYSTEM ");
            System.out.println("=================================");
            System.out.println("1. Add Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Search Patient by ID");
            System.out.println("4. Delete Patient");
            System.out.println("5. Update Patient Info");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                // ✅ ADD PATIENT
                case 1:
                    sc.nextLine();
                    System.out.print("Enter Patient Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Gender: ");
                    String gender = sc.nextLine();

                    System.out.print("Enter Blood Group: ");
                    String bloodGroup = sc.nextLine();

                    System.out.print("Enter Ailment: ");
                    String ailment = sc.nextLine();

                    Patient patient = new Patient(name, age, gender, bloodGroup, ailment);

                    if (PatientDAO.insertPatient(patient)) {
                        System.out.println("✅ Patient saved successfully!");
                    } else {
                        System.out.println("❌ Failed to save patient.");
                    }
                    break;

                // ✅ VIEW ALL
                case 2:
                    PatientDAO.getAllPatients();
                    break;

                // ✅ SEARCH BY ID
                case 3:
                    System.out.print("Enter Patient ID to search: ");
                    int searchId = sc.nextInt();
                    PatientDAO.searchPatientById(searchId);
                    break;

                // ✅ DELETE
                case 4:
                    System.out.print("Enter Patient ID to delete: ");
                    int deleteId = sc.nextInt();

                    if (PatientDAO.deletePatient(deleteId)) {
                        System.out.println("✅ Patient deleted successfully!");
                    } else {
                        System.out.println("❌ Patient not found!");
                    }
                    break;

                // ✅ UPDATE
                case 5:
                    System.out.print("Enter Patient ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Age: ");
                    int newAge = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Gender: ");
                    String newGender = sc.nextLine();

                    System.out.print("Enter New Blood Group: ");
                    String newBloodGroup = sc.nextLine();

                    System.out.print("Enter New Ailment: ");
                    String newAilment = sc.nextLine();

                    Patient updatedPatient = new Patient(
                            newName, newAge, newGender, newBloodGroup, newAilment
                    );
                    updatedPatient.setPatientId(updateId);

                    if (PatientDAO.updatePatient(updatedPatient)) {
                        System.out.println("✅ Patient updated successfully!");
                    } else {
                        System.out.println("❌ Patient not found!");
                    }
                    break;

                // ✅ EXIT
                case 6:
                    System.out.println("Thank you! Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("❌ Invalid choice!");
            }
        }
    }
}
