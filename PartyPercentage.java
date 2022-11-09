//package com.javacourse;
//
//import java.util.Scanner;
//
//public class PartyPercentage {
//    public static void main(String[] args) {
//        String party_1, party_2, party_3;
//        float vote_party_1, vote_party_2, vote_party_3;
//
//        Scanner screen = new Scanner(System.in);
//
//        System.out.println("Enter name of Political Party 1: ");
//        party_1 = screen.next();
//
//        System.out.println("Enter number of votes for Party 1: ");
//        vote_party_1 = screen.nextFloat();
//
//        System.out.println("Enter name of Political Party 2: ");
//        party_2 = screen.next();
//
//        System.out.println("Enter number of votes for Party 2: ");
//        vote_party_2 = screen.nextFloat();
//
//        System.out.println("Enter name of Political Party 3: ");
//        party_3 = screen.next();
//
//        System.out.println("Enter number of votes for Party 3: ");
//        vote_party_3 = screen.nextFloat();
//
//        float total_votes = vote_party_1 + vote_party_2 + vote_party_3;
//        float percent_party_1 = (vote_party_1/total_votes)*100;
//        float percent_party_2 = (vote_party_2/total_votes)*100;
//        float percent_party_3 = (vote_party_3/total_votes)*100;
//
//        System.out.println(percent_party_1+ " % of the vote party "+party_1+ " received");
//        System.out.println(percent_party_2+ " % of the vote party "+party_2+ " received");
//        System.out.println(percent_party_3+ " % of the vote party "+party_3+ " received");
//
//    }
//}
