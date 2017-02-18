import org.junit.Assert;
import org.junit.Test;
import seed.leetcode.demo.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by User on 2017/2/8.
 */
public class Test1 {

    @Test
    public void testA5(){
        Assert.assertNotNull(A5_LongestPalindromicSubstring.longestPalindrome("mississipi"));
    }

    @Test
    public void testA8(){
        A8_StringToInteger alg = new A8_StringToInteger();
        System.out.println(alg.myAtoi("2147483648"));
    }

    @Test
    public void testA11(){
        A11_ContainerWithMostWater alg = new A11_ContainerWithMostWater();
        System.out.println(alg.maxArea(new int[]{1,2,4,3}));
    }

    @Test
    public void testA18(){
        A18_4Sum A18 = new A18_4Sum();

        List<List<Integer>> list = A18.fourSum(new int[]{-3,-2,-1,0,0,1,2,3} , 0);

        for(List<Integer> ls : list){
            for(int val : ls){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void testA21(){
        A21_MergeTwoSortedLists alg = new A21_MergeTwoSortedLists();

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        l1.add(1);
        l1.add(99);
        l1.add(200);

        l2.add(99);
        l2.add(100);
        l2.add(101);

        Utility.printListNodeVal(alg.mergeTwoLists(Utility.ListToListNode(l1), Utility.ListToListNode(l2)));
    }

    @Test
    public void testA23(){
        A23_MergeKSortedLists alg = new A23_MergeKSortedLists();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list2.add(2);
        list2.add(4);
        list2.add(6);
        ListNode[] lists = new ListNode[2];
        lists[0] = Utility.ListToListNode(list1);
        lists[1] = Utility.ListToListNode(list2);

        Utility.printListNodeVal(alg.mergeKLists(lists));
    }

    @Test
    public void testA33(){
        A33_SearchInRotatedSortedArray alg = new A33_SearchInRotatedSortedArray();

        System.out.println(alg.search(new int[]{4,5,6,7,0,1,2}, 2));
    }

    @Test
    public void testA39(){
        A39_CombinationSum alg = new A39_CombinationSum();

        List<List<Integer>> list = alg.combinationSum(new int[]{2, 3, 6, 7}, 7);

        for(List<Integer> ls : list){
            for(int val : ls){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void testA40(){
        A40_CombinationSum_II alg = new A40_CombinationSum_II();

        List<List<Integer>> list = alg.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);

        for(List<Integer> ls : list){
            for(int val : ls){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void testA41(){
        A41_FirstMissingPositive alg = new A41_FirstMissingPositive();
        System.out.println(alg.firstMissingPositive(new int[]{1,0,3,3,0,2}));
    }

    @Test
    public void testA43(){
        A43_MultiplyStrings alg = new A43_MultiplyStrings();
        System.out.println(alg.multiply("9133", "0"));
    }

    @Test
    public void testA46(){
        List<List<Integer>> list = A46_Permutations.permute(new int[]{1,1,2});
        for(List<Integer> ls : list){
            for(int val : ls){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void testA47(){
        A47_PermutationsII alg = new A47_PermutationsII();
        List<List<Integer>> list = alg.permuteUnique(new int[]{1,1,2});
        for(List<Integer> ls : list){
            for(int val : ls){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void testA31(){
        A31_NextPermutation alg = new A31_NextPermutation();
        int[] arr = new int[]{4,5,7,3,9,8};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(alg.nextPermutation(arr)));
    }

    @Test
    public void testA48(){
        A48_RotateImage alg = new A48_RotateImage();
        int[][] arr1 = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };
        alg.rotate(arr1);
    }

    @Test
    public void testA49(){
        A49_GroupAnagrams alg = new A49_GroupAnagrams();
        //List<List<String>> list = alg.groupAnagrams(new String[]{"compilations","bewailed","horology","lactated","blindsided","swoop","foretasted","ware","abuts","stepchild","arriving","magnet","vacating","relegates","scale","melodically","proprietresses","parties","ambiguities","bootblacks","shipbuilders","umping","belittling","lefty","foremost","bifocals","moorish","temblors","edited","hint","serenest","rendezvousing","schoolmate","fertilizers","daiquiri","starr","federate","rectal","case","kielbasas","monogamous","inflectional","zapata","permitted","concessions","easters","communique","angelica","shepherdess","jaundiced","breaks","raspy","harpooned","innocence","craters","cajun","pueblos","housetop","traits","bluejacket","pete","snots","wagging","tangling","cheesecakes","constructing","balanchine","paralyzed","aftereffects","dotingly","definitions","renovations","surfboards","lifework","knacking","apprises","minimalism","skyrocketed","artworks","instrumentals","eardrums","hunching","codification","vainglory","clarendon","peters","weeknight","statistics","ay","aureomycin","lorrie","compassed","speccing","galen","concerto","rocky","derision","exonerate","sultrier","mastoids","repackage","cyclical","gowns","regionalism","supplementary","bierce","darby","memorize","songster","biplane","calibrates","decriminalizes","shack","idleness","confessions","snippy","barometer","earthing","sequence","hastiness","emitted","superintends","stockades","busywork","dvina","aggravated","furbelow","hashish","overextended","foreordain","lie","insurance","recollected","interpreted","congregate","ranks","juts","dampen","gaits","eroticism","neighborhoods","perihelion","simulations","fumigating","balkiest","semite","epicure","heavier","masterpiece","bettering","lizzie","wail","batsmen","unbolt","cudgeling","bungalow","behalves","refurnishes","pram","spoonerisms","cornered","rises","encroachments","gabon","cultivation","parsed","takeovers","stampeded","persia","devotional","doorbells","psalms","cains","copulated","archetypal","cursores","inbred","paradigmatic","thesauri","rose","stopcocks","weakness","ballsier","jagiellon","torches","hover","conservationists","brightening","dotted","rodgers","mandalay","overjoying","supervision","gonads","portage","crap","capers","posy","collateral","funny","garvey","ravenously","arias","kirghiz","elton","gambolled","highboy","kneecaps","southey","etymology","overeager","numbers","ebullience","unseemly","airbrushes","excruciating","gemstones","juiciest","muftis","shadowing","organically","plume","guppy","obscurely","clinker","confederacies","unhurried","monastic","witty","breastbones","ijsselmeer","dublin","linnaeus","dervish","bluefish","selectric","syllable","pogroms","pacesetters","anastasia","pandora","foci","bipartisan","loomed","emits","gracious","warfare","uncouples","augusts","portray","refinery","resonances","expediters","deputations","indubitably","richly","motivational","gringo","hubris","mislay","scad","lambastes","reemerged","wart","zirconium","linus","moussorgsky","swopped","sufferer","sputtered","tamed","merrimack","conglomerate","blaspheme","overcompensate","rheas","pares","ranted","prisoning","rumor","gabbles","lummox","lactated","unzipping","tirelessly","backdate","puzzling","interject","rejections","bust","centered","oxymoron","tangibles","sejong","not","tameness","consumings","prostrated","rowdyism","ardent","macabre","rustics","dodoes","warheads","wraths","bournemouth","staffers","retold","stiflings","petrifaction","larkspurs","crunching","clanks","briefest","clinches","attaching","extinguished","ryder","shiny","antiqued","gags","assessments","simulated","dialed","confesses","livelongs","dimensions","lodgings","cormorants","canaries","spineless","widening","chappaquiddick","blurry","lassa","vilyui","desertions","trinket","teamed","bidets","mods","lessors","impressiveness","subjugated","rumpuses","swamies","annotations","batiks","ratliff","waxwork","grander","junta","chutney","exalted","yawl","joke","vocational","diabetic","bullying","edit","losing","banns","doleful","precision","excreting","foals","smarten","soliciting","disturbance","soggily","gabrielle","margret","faded","pane","jerusalem","bedpan","overtaxed","brigs","honors","repackage","croissants","kirov","crummier","limeades","grandson","criers","bring","jaundicing","omnibusses","gawking","tonsillectomies","deodorizer","nosedove","commence","faulkner","adultery","shakedown","wigwag","wiper","compatible","ultra","adamant","distillation","gestates","semi","inmate","onlookers","grudgingly","recipe","chaise","dialectal","aphids","flimsier","orgasm","sobs","swellheaded","utilize","karenina","irreparably","preteen","mumble","gingersnaps","alumnus","chummiest","snobbish","crawlspaces","inappropriate","ought","continence","hydrogenate","eskimo","desolated","oceanic","evasive","sake","laziest","tramps","joyridden","acclimatized","riffraff","thanklessly","harmonizing","guinevere","demanded","capabler","syphilitics","brainteaser","creamers","upholds","stiflings","walt","luau","deafen","concretely","unhand","animations","map","limbos","tranquil","windbreakers","limoges","varying","declensions","signs","green","snowbelt","homosexual","hopping","residue","ransacked","emeritus","pathologist","brazenly","forbiddingly","alfredo","glummest","deciphered","delusive","repentant","complainants","beets","syntactics","vicissitude","incompetents","concur","canaan","rowdies","streamer","martinets","shapeliness","videodiscs","restfulness","rhea","consumed","pooching","disenfranchisement","impoverishes","behalf","unsuccessfully","complicity","ulcerating","derisive","jephthah","clearing","reputation","kansan","sledgehammer","benchmarks","escutcheon","portfolios","mandolins","marketable","megalomaniacs","kinking","bombarding","wimple","perishes","rukeyser","squatter","coddle","traditionalists","sifts","agglomerations","seasonings","brightness","spices","claimant","sofas","ambulatories","bothered","businessmen","orly","kinetic","contracted","grenadiers","flooding","dissolved","corroboration","mussed","squareness","alabamans","dandelions","labyrinthine","pot","waxwing","residential","pizza","overjoying","whelps","overlaying","elanor","tented","masterminded","balsamed","powerhouses","tramps","eisenstein","voile","repellents","beaus","coordinated","wreckers","eternities","untwists","estrangements","vitreous","embodied"});
        List<List<String>> list = alg.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        for(List<String> ls : list){
            for(String val : ls){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void testA50(){
        A50_Pow alg = new A50_Pow();
        System.out.println(alg.myPow(34.00515,-3));
    }

    @Test
    public void testA53(){
        A53_MaximumSubarray alg = new A53_MaximumSubarray();
        System.out.println(alg.maxSubArray(new int[]{ -45,-2,-71,2,78,98,56,-5,-30,-91,73,-85,10,80,93,76,48,-44,72,-58,-83,20,49,-64,94,18,11,48,16,2,-26,47,99,-21,-50,55,-23,-94,-73,46,-85 }));
    }

    @Test
    public void testA54(){
        A54_SpiralMatrix alg = new A54_SpiralMatrix();
        int[][] arr1 = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25},
                {26,27,28,29,30}
        };
        List<Integer> list = alg.spiralOrder(arr1);
        for(int val : list){
            System.out.print(val + " ");
        }
    }

    @Test
    public void testA56(){
        A56_MergeIntervals alg = new A56_MergeIntervals();

        List<Interval> list = new ArrayList<>();
        list.add(new Interval(1,4));
        list.add(new Interval(5,6));

        List<Interval> result = alg.merge(list);

        for(Interval intv : result){
            System.out.println(intv.toString());
        }
    }

    @Test
    public void testA58(){
        A58_LengthOfLastWord alg = new A58_LengthOfLastWord();
        System.out.println(alg.lengthOfLastWord(" a "));
    }

    @Test
    public void testA59(){
        A59_SpiralMatrixII alg = new A59_SpiralMatrixII();
        int[][] result = alg.generateMatrix(5);

        for(int[] ary : result){
            System.out.println(Arrays.toString(ary));
        }
    }

    @Test
    public void testA60(){
        A60_PermutationSequence alg = new A60_PermutationSequence();

        System.out.println(alg.getPermutation(9,54494));
    }

    @Test
    public void testA61(){
        A61_RotateList alg = new A61_RotateList();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        ListNode node = Utility.ListToListNode(list);
        Utility.printListNodeVal(alg.rotateRight(node, 7));
    }

    @Test
    public void test62(){
        A62_UniquePaths alg = new A62_UniquePaths();

        System.out.println(alg.uniquePaths(100,100));
        //System.out.println(alg.uniquePaths2(23,12));
    }

    @Test
    public void testA63(){
        A63_UniquePathsII alg = new A63_UniquePathsII();

        System.out.println(alg.uniquePathsWithObstacles(
                new int[][]{
                        {0,1,0,0,0},
                        {1,0,0,0,0},
                        {0,0,0,0,0},
                        {0,0,0,0,0}
                }
        ));
    }

    @Test
    public void testA64(){
        A64_MinimumPathSum alg = new A64_MinimumPathSum();

        System.out.println(alg.minPathSum(
                new int[][]{
                        {1,4,8,6,2,2,1,7},
                        {4,7,3,1,4,5,5,1},
                        {8,8,2,1,1,8,0,1},
                        {8,9,2,9,8,0,8,9},
                        {5,7,5,7,1,8,5,5},
                        {7,0,9,4,5,6,5,6},
                        {4,9,9,7,9,1,9,0}
                }
        ));
    }

    @Test
    public void testA66(){
        A66_PlusOne alg = new A66_PlusOne();
        System.out.println(Arrays.toString(alg.plusOne(
                new int[]{9,9,9,9})
        ));
    }

    @Test
    public void testA67(){
        A67_AddBinary alg = new A67_AddBinary();
        System.out.println(alg.addBinary("100","110010"));
    }

    @Test
    public void testA69(){
        A69_SqrtX alg = new A69_SqrtX();
        System.out.println(alg.mySqrt(2147395600));
    }

    @Test
    public void testA70(){
        A70_ClimbingStairs alg = new A70_ClimbingStairs();
        System.out.println(alg.climbStairs(3));
    }

    @Test
    public void testA71(){
        A71_SimplifyPath alg = new A71_SimplifyPath();
        System.out.println(alg.simplifyPath("/a/./b/../../../../c/"));
    }

    @Test
    public void testA73(){
        A73_SetMatrixZeroes alg = new A73_SetMatrixZeroes();
        alg.setZeroes(new int[][]{
                {0,0,0,5},
                {4,3,1,4},
                {0,1,1,4},
                {1,2,1,3},
                {0,0,1,1}
        });
    }

    @Test
    public void testA74(){
        A74_Search2DMatrix alg = new A74_Search2DMatrix();
        System.out.println(alg.searchMatrix(
                new int[][]{
                        {1,3}
                },
                2
        ));
    }

    @Test
    public void testA75(){
        A75_SortColors alg = new A75_SortColors();
        alg.sortColors(new int[]{  1,2,0,1,2,0,1,0,1,2  });
    }

    @Test
    public void testA77(){
        A77_Combinations alg = new A77_Combinations();
        List<List<Integer>> list = alg.combine(4,2);
        for(List<Integer> ls : list){
            for(Integer val : ls){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void testA78(){
        A78_Subsets alg = new A78_Subsets();
        List<List<Integer>> list = alg.subsets(new int[]{1,2,3});
        for(List<Integer> ls : list){
            for(Integer val : ls){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void testA79(){
        A79_WordSearch alg = new A79_WordSearch();
        System.out.println(alg.exist( new char[][]{
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
                },
                "ABCCEDASG"
        ));
    }

    @Test
    public void testA80(){
        A80_RemoveDuplicatesFromSortedArrayII alg = new A80_RemoveDuplicatesFromSortedArrayII();
        alg.removeDuplicates( new int[]{-3,-1,0,0,0,3,3} );
    }

    @Test
    public void testA81(){
        A81_SearchInRotatedSortedArrayII alg = new A81_SearchInRotatedSortedArrayII();

        System.out.println(alg.search(new int[]{2,3,3,4,5,6,7,0,0,1,2}, 2));
    }

    @Test
    public void testA82(){
        A82_RemoveDuplicatesFromSortedListII alg = new A82_RemoveDuplicatesFromSortedListII();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);

        Utility.printListNodeVal(alg.deleteDuplicates(Utility.ListToListNode(list)));

    }

    @Test
    public void testA83(){
        A83_RemoveDuplicatesFromSortedList alg = new A83_RemoveDuplicatesFromSortedList();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);

        Utility.printListNodeVal(alg.deleteDuplicates(Utility.ListToListNode(list)));

    }

    @Test
    public void testA84(){
        A84_LargestRectangleInHistogram alg = new A84_LargestRectangleInHistogram();

        System.out.println(alg.largestRectangleArea(new int[]{ 2147483647,0,2147483647,0,2147483647,0,2147483647,0,2147483647,0 }));
    }

    @Test
    public void testA85(){
        A85_MaximalRectangle alg = new A85_MaximalRectangle();

        System.out.println(alg.maximalRectangle(new char[][]
                {
                        {'1'}
//                        {'1','1','0','1','0','1'},
//                        {'0','1','1','1','1','1'},
//                        {'1','1','1','1','0','1'},
//                        {'1','1','1','1','0','1'}
//                        {'1','0','1','0','0'},
//                        {'1','0','1','1','1'},
//                        {'1','1','1','1','1'},
//                        {'1','0','0','1','0'}
                }));
    }

    @Test
    public void testA86(){
        A86_PartitionList alg = new A86_PartitionList();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(2);

        Utility.printListNodeVal(alg.partition(Utility.ListToListNode(list), 3));
    }

    @Test
    public void testA89(){
        A89_GrayCode alg = new A89_GrayCode();
        List<Integer> list = alg.grayCode(2);
        for(int i: list){
            System.out.println(i);
        }
    }

    @Test
    public void testA90(){
        A90_SubsetsII alg = new A90_SubsetsII();

        List<List<Integer>> list = alg.subsetsWithDup(new int[]{1,2,2,2,2});
        for(List<Integer> ls : list){
            for(Integer val : ls){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void testA91(){
        A91_DecodeWays alg = new A91_DecodeWays();

        System.out.println(alg.numDecodings("27"));
    }

}
