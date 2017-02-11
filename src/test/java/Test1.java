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

}
