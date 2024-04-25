package ejercicio_8;

import java.util.Random;

public class ejercicio_8 {
    public static void main(String[] args) {
        String dna = generateRandomDNA(1000);
        int geneCount = countGenes(dna);
        System.out.println("Number of genes: " + geneCount);
    }

    public static String generateRandomDNA(int length) {
        String bases = "ATGC";
        Random rand = new Random();
        StringBuilder dna = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            dna.append(bases.charAt(rand.nextInt(4)));
        }
        return dna.toString();
    }

    public static int countGenes(String dna) {
        int geneCount = 0;
        int startIndex = 0;
        while (startIndex < dna.length() - 2) {
            int startGene = dna.indexOf("ATG", startIndex);
            if (startGene == -1) {
                break; // No more genes
            }
            int endGene = findEndGene(dna, startGene + 3); // Find the end of the gene
            if (endGene != -1) {
                geneCount++;
                startIndex = endGene + 3;
            } else {
                startIndex = startGene + 3;
            }
        }
        return geneCount;
    }

    public static int findEndGene(String dna, int startIndex) {
        int indexTAG = dna.indexOf("TAG", startIndex);
        int indexTAA = dna.indexOf("TAA", startIndex);
        int indexTGA = dna.indexOf("TGA", startIndex);
        // Return the smallest index that is not -1
        if (indexTAG == -1 || (indexTAA != -1 && indexTAA < indexTAG)) {
            indexTAG = indexTAA;
        }
        if (indexTAG == -1 || (indexTGA != -1 && indexTGA < indexTAG)) {
            indexTAG = indexTGA;
        }
        return indexTAG;
    }
}