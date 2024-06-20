package iut.sae.algo;

import org.junit.Test;
import junit.framework.TestCase;


public class AlgoTestCorrige extends TestCase{

/*
 * RLE("")=""
 * RLE("abc")="1a1b1c"
 * RLE("abbccc")="1a2b3c"
 * RLE("aaabaa")="3a1b2a"
 * RLE("aAa")="1a1A1a"
 */
   @Test
   public void testRLE(){
      assertEquals("", AlgoCorriger.RLE("") );
      
      assertEquals("1a1b1c", AlgoCorriger.RLE("abc"));
      assertEquals("1a2b3c", AlgoCorriger.RLE("abbccc"));
      assertEquals("3a1b2a", AlgoCorriger.RLE("aaabaa"));
      assertEquals("1a1A1a", AlgoCorriger.RLE("aAa"));
      assertEquals("9W4W", AlgoCorriger.RLE("WWWWWWWWWWWWW"));


      //Tests supplémentairs fait par le correcteur
      assertEquals("1a1b1c1A1B1C1D1E1d1e", AlgoCorriger.RLE("abcABCDEde"));
      assertEquals("1a1b9B7B2b1c", AlgoCorriger.RLE("abBBBBBBBBBBBBBBBBbbc"));
      assertEquals("2a", AlgoCorriger.RLE("aa"));
      assertEquals("111213", AlgoCorriger.RLE("123"));
      assertEquals("259n9n2n3z2r1t1r1y261019", AlgoCorriger.RLE("55nnnnnnnnnnnnnnnnnnnnzzzrrtry6609"));

   }
   

   /*
   * RLE(str, 1)=RLE(str)
   * RLE(str, 3)=RLE(RLE(RLE(str)))
   */
   @Test
   public void testRLERecursif(){
      try{
         assertEquals("", AlgoCorriger.RLE("", 1));
         assertEquals("", AlgoCorriger.RLE("", 3));
         
         assertEquals("1a1b1c", AlgoCorriger.RLE("abc", 1));
         assertEquals("1a2b3c", AlgoCorriger.RLE("abbccc", 1));
         assertEquals("3a1b2a", AlgoCorriger.RLE("aaabaa", 1));
         assertEquals("1a1A1a", AlgoCorriger.RLE("aAa", 1));

         assertEquals("111a111b111c", (AlgoCorriger.RLE("abc", 2)));
         assertEquals("311a311b311c", (AlgoCorriger.RLE("abc", 3)));

         String saeIte20="1113122113121113222123211211131211121311121321123113213221121113122123211211131221121311121312211213211321322112311311222113311213212322211211131221131211221321123113213221121113122113121113222112131112131221121321131211132221121321132132211331121321232221123113112221131112311322311211131122211213211331121321122112133221121113122113121113222123112221221321132132211231131122211331121321232221121113122113121113222123113221231231121113213221231221132221222112112322211S1113122113121113222123211211131211121311121321123113213221121113122123211211131221121311121312211213211321322112311311222113311213212322211211131221131211221321123113213221121113122113121113222112131112131221121321131211132221121321132132211331121321232221123113112221131112311322311211131122211213211331121321122112133221121113122113121113222123112221221321132132211231131122211331121321232221121113122113121113222123113221231231121113213221231221132221222112112322211A1113122113121113222123211211131211121311121321123113213221121113122123211211131221121311121312211213211321322112311311222113311213212322211211131221131211221321123113213221121113122113121113222112131112131221121321131211132221121321132132211331121321232221123113112221131112311322311211131122211213211331121321122112133221121113122113121113222123112221221321132132211231131122211331121321232221121113122113121113222123113221231231121113213221231221132221222112112322211E1113122113121113222123211211131211121311121321123113213221121113122123211211131221121311121312211213211321322112311311222113311213212322211211131221131211221321123113213221121113122113121113222112131112131221121321131211132221121321132132211331121321232221123113112221131112311322311211131122211213211331121321122112133221121113122113121113222123112221221321132132211231131122211331121321232221121113122113121113222123113221231231121113213221231221132221222112112322211 1113122113121113222123211211131211121311121321123113213221121113122123211211131221121311121312211213211321322112311311222113311213212322211211131221131211221321123113213221121113122113121113222112131112131221121321131211132221121321132132211331121321232221123113112221131112311322311211131122211213211331121321122112133221121113122113121113222123112221221321132132211231131122211331121321232221121113122113121113222123113221231231121113213221231221132221222112112322211A1113122113121113222123211211131211121311121321123113213221121113122123211211131221121311121312211213211321322112311311222113311213212322211211131221131211221321123113213221121113122113121113222112131112131221121321131211132221121321132132211331121321232221123113112221131112311322311211131122211213211331121321122112133221121113122113121113222123112221221321132132211231131122211331121321232221121113122113121113222123113221231231121113213221231221132221222112112322211l1113122113121113222123211211131211121311121321123113213221121113122123211211131221121311121312211213211321322112311311222113311213212322211211131221131211221321123113213221121113122113121113222112131112131221121321131211132221121321132132211331121321232221123113112221131112311322311211131122211213211331121321122112133221121113122113121113222123112221221321132132211231131122211331121321232221121113122113121113222123113221231231121113213221231221132221222112112322211g1113122113121113222123211211131211121311121321123113213221121113122123211211131221121311121312211213211321322112311311222113311213212322211211131221131211221321123113213221121113122113121113222112131112131221121321131211132221121321132132211331121321232221123113112221131112311322311211131122211213211331121321122112133221121113122113121113222123112221221321132132211231131122211331121321232221121113122113121113222123113221231231121113213221231221132221222112112322211o";
         assertEquals(saeIte20, AlgoCorriger.RLE("SAE Algo", 20));


         //Tests supplémentairs fait par le correcteur
         String saeIte15 = "311311222113111231133211121312211231131112311211133112111312211213211312111322211231131122111213122112311311221132211221121332211a311311222113111231133211121312211231131112311211133112111312211213211312111322211231131122111213122112311311221132211221121332211z311311222113111231133211121312211231131112311211133112111312211213211312111322211231131122111213122112311311221132211221121332211e311311222113111231133211121312211231131112311211133112111312211213211312111322211231131122111213122112311311221132211221121332211r311311222113111231133211121312211231131112311211133112111312211213211312111322211231131122111213122112311311221132211221121332211t311311222113111231133211121312211231131112311211133112111312211213211312111322211231131122111213122112311311221132211221121332211y";
         assertEquals(saeIte15, AlgoCorriger.RLE("azerty", 15));

      }
      catch(Exception e){
         fail("Exception inatendue");
      }
   }

   /*
  * unRLE(RLE(str))=str
  *
  * unRLE("")=""
  * unRLE("1a1b1c")="abc"
  * unRLE("1a2b3c")="abbccc"
  * unRLE("3a1b2a")="aaabaa"
  * unRLE("1a1A1a")="aAa"
  */

   @Test
   public void testUnRLE(){
      try{
         assertEquals("", AlgoCorriger.unRLE(""));
         assertEquals("abc", AlgoCorriger.unRLE("1a1b1c"));
         assertEquals("abbccc", AlgoCorriger.unRLE("1a2b3c"));
         assertEquals("aaabaa", AlgoCorriger.unRLE("3a1b2a"));
         assertEquals("aAa", AlgoCorriger.unRLE("1a1A1a"));
         assertEquals("WWWWWWWWWWWWW", AlgoCorriger.unRLE("9W4W"));


         //Tests supplémentairs fait par le correcteur
         assertEquals("aaAAaaBBaa", AlgoCorriger.unRLE("2a2A2a2B2a"));
         assertEquals("aAAbbbBBBBccccc", AlgoCorriger.unRLE("1a2A3b4B5c"));
         assertEquals("aAAbbbBBBBccccc", AlgoCorriger.unRLE(AlgoCorriger.RLE("aAAbbbBBBBccccc")));

      }
      catch(Exception e){
         fail("Exception inatendue");
      }
   }
   
   @Test
   public void testUnRLERecursif(){
      try{
         assertEquals("", AlgoCorriger.unRLE("", 1));
         assertEquals("", AlgoCorriger.unRLE("", 3));
         
         assertEquals("abc", AlgoCorriger.unRLE("1a1b1c", 1));
         assertEquals("abbccc", AlgoCorriger.unRLE("1a2b3c", 1));
         assertEquals("aaabaa", AlgoCorriger.unRLE("3a1b2a", 1));
         assertEquals("aAa", AlgoCorriger.unRLE("1a1A1a", 1));

         assertEquals("abc", (AlgoCorriger.unRLE("111a111b111c", 2)));
         assertEquals("abc", (AlgoCorriger.unRLE("311a311b311c", 3)));


         //Tests supplémentairs fait par le correcteur
         assertEquals("aaaavrrvr", (AlgoCorriger.unRLE("3114311a13211v3112311r13211v13211r", 4)));
         assertEquals("zzzzERRTTTRZaz", (AlgoCorriger.unRLE("1113122114111312211z31131122211E1113122112111312211R11131211121312211T31131122211R31131122211Z31131122211a31131122211z", 6)));
               
         assertEquals("azerty",AlgoCorriger.unRLE(AlgoCorriger.RLE("azerty", 15), 15));

      }
      catch(Exception e){
         fail("Exception inatendue");
      }
   }

}