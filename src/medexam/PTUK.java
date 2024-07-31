package medexam;

import java.util.Arrays;

public class PTUK extends University {
    public static final int TULKARM = 0;
    public static final int RAMALLAH = 1;
    public static final int AROOB = 2;
    private int branch;
    private Department[] departments;
    public PTUK(String name, String email, int branch, Department[] departments) {
        super(name, email);
        this.branch = branch;
        this.departments = departments;
    }

//    @Override
//    public String toString() {
//        StringBuilder builder = new StringBuilder(super.toString());
//        builder.append(", Branch: ").append(branchName());
//        for (Department dept : departments) {
//            if (dept != null) {
//                builder.append("\n").append(dept);
//            }
//        }
//        return builder.toString();
//    }


//    @Override
//    public String toString() {
//        String result = super.toString() + ", Branch: " + branchName();
//        for (Department dept : departments) {
//            if (dept != null) {
//                result += "\n" + dept.toString();
//            }
//        }
//        return result;
//    }
    @Override
public String toString() {
    String result = super.toString() + ", Branch: " + branchName();
    for (int i = 0; i < departments.length; i++) {

            result += "\n" + departments[i];

    }
    return result;
}

    private String branchName() {
        switch (branch) {
            case TULKARM: return "Tulkarm";
            case RAMALLAH: return "Ramallah";
            case AROOB: return "Aroob";
            default: return "Unknown";
        }
    }
}

