package Miscellaneous;

import java.util.Scanner;

public class bestFitVsfirstFit {
    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);
        System.out.println("enter the number of the segments");
        int segments = n.nextInt();
        int[] segment_values = new int[segments];
        for (int i = 0; i < segments; i++) {
            System.out.println("value of the segments" + (i + 1));
            segment_values[i] = n.nextInt();
        }
        System.out.println("enter the number of the processes");
        int processes = n.nextInt();
        int processes_values[] = new int[processes];
        String array_process_name[] = new String[processes];
        for (int i = 0; i < processes; i++) {
            n.nextLine();
            System.out.println("enter the name of the process");
            array_process_name[i] = n.nextLine();
            System.out.println("enter the process space required int the main memory");
            processes_values[i] = n.nextInt();
        }
        System.out.println("First fit algorithm :");
        first_come(segment_values, processes_values, array_process_name);
        System.out.println("Best fit algorithm :");
        best_fit(segment_values, processes_values, array_process_name);

    }

    public static void first_come(int segments[], int processes[], String array_process_name[]) {
        String display_pattern[] = new String[array_process_name.length];
        boolean checking[] = new boolean[segments.length];
        for (int i = 0; i < checking.length; i++) {
            checking[i] = true;
        }
        loop1:
        for (int j = 0; j < processes.length; j++) {
            for (int i = 0; i < segments.length; i++) {
                if (processes[j] <= segments[i] && checking[i] == true) {
                    checking[i] = false;
                    display_pattern[j] = Integer.toString(i + 1);
                    continue loop1;
                }
                display_pattern[j] = "not space allocated";
            }
        }
        printing(array_process_name, display_pattern);


    }

    public static void best_fit(int segments[], int processes[], String array_process_name[]) {
        String display_pattern[] = new String[array_process_name.length];
        boolean checking[] = new boolean[segments.length];
        int minimum[] = new int[segments.length];
        int reference = 0;
        int position = 0;

        for (int i = 0; i < checking.length; i++) {
            checking[i] = true;
        }
        loop1:
        for (int j = 0; j < processes.length; j++) {
            for (int k = 0; k < minimum.length; k++) {
                minimum[k] = 0;
            }

            for (int i = 0; i < segments.length; i++) {
                if (processes[j] <= segments[i] && checking[i] == true) {
                    minimum[i] = segments[i];
                    reference = segments[i];
                    position = i;
                }
                loop2:
                for (int h = 0; h < minimum.length; h++) {
                    if (minimum[h] == 0) {
                        continue loop2;
                    } else if (minimum[h] < reference) {
                        reference = minimum[h];
                        position = h;
                    }
                }
            }
            checking[position] = false;
            display_pattern[j] = Integer.toString(position + 1);
            continue loop1;
        }
        printing(array_process_name, display_pattern);

    }

    public static void printing(String array_processes_name[], String display_pattern[]) {
        System.out.println("process name       segment of the memory");
        for (int i = 0; i < array_processes_name.length; i++) {
            System.out.println(array_processes_name[i] + "               " + display_pattern[i]);
        }
    }
}