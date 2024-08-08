package main.java.com.pareekshit.techgig;

import java.util.*;
import java.util.stream.Collectors;

public class BeybladeWorldChampionship {
    public static void main(String[] args) {
        long maxFightsWonByGRevolution;
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
        int testCases = Integer.parseInt(scanner.next().trim());
        for (int i = 0; i < testCases; i++) {
            maxFightsWonByGRevolution = 0;
            long noOfPlayers = Long.parseLong(scanner.next().trim());
            String s = scanner.next().trim();
            TreeMap<Long, Integer> gRevolutions = new TreeMap<>();
            String[] array = s.split(" ");
            for (String element : array) {
                if (element.isEmpty()) continue;
                Long value = Long.parseLong(element.trim());
                if (gRevolutions.containsKey(value)) {
                    gRevolutions.put(value, gRevolutions.get(value) + 1);
                } else {
                    gRevolutions.put(value, 1);
                }
            }
            s = scanner.next().trim();
            TreeMap<Long, Integer> opponentsMap = new TreeMap<>();
            array = s.split(" ");
            for (String element : array) {
                if (element.isEmpty()) continue;
                Long value = Long.parseLong(element.trim());
                if (opponentsMap.containsKey(value)) {
                    opponentsMap.put(value, opponentsMap.get(value) + 1);
                } else {
                    opponentsMap.put(value, 1);
                }
            }
            for (Long player : gRevolutions.keySet()) {
                Map.Entry<Long, Integer> data = opponentsMap.lowerEntry(player);
                if (Objects.nonNull(data)) {
                    maxFightsWonByGRevolution += 1;
                    if (data.getValue() - 1 == 0) {
                        opponentsMap.remove(data.getKey());
                    } else {
                        opponentsMap.put(data.getKey(), data.getValue() - 1);
                    }
                }
            }
            System.out.println(maxFightsWonByGRevolution);
        }
    }

    public void bruteForce() {
        long maxFightsWonByGRevolution = 0;
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
        int testCases = Integer.parseInt(scanner.next().trim());
        for (int i = 0; i < testCases; i++) {
            maxFightsWonByGRevolution = 0;
            long noOfPlayers = Long.parseLong(scanner.next().trim());
            String s = scanner.next().trim();
            List<Long> gRevolution = Arrays.stream(Arrays.stream(s.split(" "))
                            .mapToLong(Long::parseLong).toArray())
                    .boxed().collect(Collectors.toList());
            s = scanner.next().trim();
            List<Long> opponents = Arrays.stream(Arrays.stream(s.split(" "))
                            .mapToLong(Long::parseLong).toArray())
                    .boxed().collect(Collectors.toList());
            if (gRevolution.size() == opponents.size()) {
                Collections.sort(opponents);
                Collections.sort(gRevolution);
                for (Long player : gRevolution) {
                    for (Long opponent : opponents) {
                        if (player > opponent) {
                            opponents.remove(opponent);
                            maxFightsWonByGRevolution += 1;
                            break;
                        }
                    }
                }
            }
            System.out.print(maxFightsWonByGRevolution);
        }
    }
}
