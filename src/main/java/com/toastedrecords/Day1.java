package com.toastedrecords;

import com.toastedrecords.common.InputReader;

import java.util.ArrayList;
import java.util.List;

public class Day1 {
    public static void main(String[] args) {
        List<String> input = InputReader.parseInput("day1");
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (String s : input) {
            String[] raw = s.split("   ");
            left.add(Integer.parseInt(raw[0]));
            right.add(Integer.parseInt(raw[1]));
        }

        int sum = part1(left, right);
        System.out.println(sum);

        sum = part2(left, right);
        System.out.println(sum);
    }

    private static int part2(List<Integer> left, List<Integer> right) {
        int sum = 0;

        for (int i=0; i<left.size(); i++) {
            int count = 0;
            int l = 0;
            for (int j=0; j<right.size(); j++) {
                l = left.get(i);
                int r = right.get(j);

                if (l == r) {
                    count++;
                }
            }
            sum+=l*count;
        }

        return sum;
    }

    private static int part1(List<Integer> left, List<Integer> right) {
        left = left.stream().sorted().toList();
        right = right.stream().sorted().toList();

        int sum = 0;
        for (int i=0; i<left.size(); i++) {
            sum += Math.abs(left.get(i) - right.get(i));
        }
        return sum;
    }
}
