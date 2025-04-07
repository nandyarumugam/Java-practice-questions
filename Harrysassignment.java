package assignment;

class Harrysassignment {
    String name;
    String usn;
    String college;
    int cgpa;

    Harrysassignment(String name, String usn, String college, int cgpa) {
        this.name = name;
        this.usn = usn;
        this.college = college;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Harrysassignment{" +
                "name='" + name + '\'' +
                ", usn='" + usn + '\'' +
                ", college='" + college + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}

class StudentImplementation {
    Harrysassignment stuname;

    StudentImplementation(Harrysassignment stuname) {
        this.stuname = stuname;
    }

    Harrysassignment getStudentInfo(String str) {
        if (stuname != null && stuname.name.equals(str)) {
            return this.stuname;
        }
        return null;
    }

    public String getStudentSection(Student1 std) {
        if (std == null || std.usn.length() < 3) {
            return "Invalid USN";
        }

        String lastThreeDigitsStr = std.usn.replaceAll("[^0-9]", ""); // Extract numbers from USN
        if (lastThreeDigitsStr.length() < 3) {
            return "Invalid USN";
        }

        lastThreeDigitsStr = lastThreeDigitsStr.substring(lastThreeDigitsStr.length() - 3); // Get last three digits
        int lastThreeDigits = Integer.parseInt(lastThreeDigitsStr);

        if (lastThreeDigits >= 1 && lastThreeDigits <= 60) {
            return "A";
        } else if (lastThreeDigits >= 61 && lastThreeDigits <= 120) {
            return "B";
        } else if (lastThreeDigits >= 121 && lastThreeDigits <= 180) {
            return "C";
        }
        return "Z";
    }
}

public class StdDemo {
    public static void main(String[] args) {
        Harrysassignment s2 = new Harrysassignment("chenna", "MIT123060", "mits", 8); // Ensure USN has digits
        StudentImplementation si = new StudentImplementation(s2);

        Harrysassignment result = si.getStudentInfo("chenna");
        if (result != null) {
            System.out.println("Student Found: " + result);
            System.out.println("Section: " + si.getStudentSection(result));
        } else {
            System.out.println("Student Not Found");
        }
    }
}
