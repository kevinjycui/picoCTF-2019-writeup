# waves over lambda
Points: 300
## Category
Cryptography
## Problem Statement
> We made alot of substitutions to encrypt this. Can you decrypt it? Connect with `nc 2019shell1.picoctf.com 32282`.
## Hints
> Flag is not in the usual flag format
## Solution
The problem statement tells us that substitutions were used in encrypting this. After connecting with the host, we get a lot of gibberish:
```
-------------------------------------------------------------------------------
wzxthmqs lghg fs yzvh romt - rhgcvgxwy_fs_w_zdgh_omanjm_kqqlqqznvw
-------------------------------------------------------------------------------
ngquggx vs qlghg ums, ms f lmdg mohgmjy smfj szagulghg, qlg nzxj zr qlg sgm. ngsfjgs lzojfxt zvh lgmhqs qztgqlgh qlhzvtl ozxt kghfzjs zr sgkmhmqfzx, fq lmj qlg grrgwq zr amifxt vs qzoghmxq zr gmwl zqlgh's ymhxsmxj gdgx wzxdfwqfzxs. qlg omuyghqlg ngsq zr zoj rgoozuslmj, ngwmvsg zr lfs amxy ygmhs mxj amxy dfhqvgs, qlg zxoy wvslfzx zx jgwi, mxj ums oyfxt zx qlg zxoy hvt. qlg mwwzvxqmxq lmj nhzvtlq zvq mohgmjy m nzb zr jzafxzgs, mxj ums qzyfxt mhwlfqgwqvhmooy ufql qlg nzxgs. amhozu smq whzss-ogttgj hftlq mrq, ogmxfxt mtmfxsq qlg afppgx-amsq. lg lmj svxigx wlggis, m ygoozu wzakogbfzx, m sqhmftlq nmwi, mx mswgqfw mskgwq, mxj, ufql lfs mhas jhzkkgj, qlg kmoas zr lmxjs zvqumhjs, hgsganogj mx fjzo. qlg jfhgwqzh, smqfsrfgj qlg mxwlzh lmj tzzj lzoj, amjg lfs umy mrq mxj smq jzux mazxtsq vs. ug gbwlmxtgj m rgu uzhjs ompfoy. mrqghumhjs qlghg ums sfogxwg zx nzmhj qlg ymwlq. rzh szag hgmszx zh zqlgh ug jfj xzq ngtfx qlmq tmag zr jzafxzgs. ug rgoq agjfqmqfdg, mxj rfq rzh xzqlfxt nvq komwfj sqmhfxt. qlg jmy ums gxjfxt fx m sghgxfqy zr sqfoo mxj gbcvfsfqg nhfoofmxwg. qlg umqgh slzxg kmwfrfwmooy; qlg siy, ufqlzvq m skgwi, ums m ngxftx faagxsfqy zr vxsqmfxgj oftlq; qlg dghy afsq zx qlg gssgb amhsl ums ofig m tmvpy mxj hmjfmxq rmnhfw, lvxt rhza qlg uzzjgj hfsgs fxomxj, mxj jhmkfxt qlg ozu slzhgs fx jfmklmxzvs rzojs. zxoy qlg tozza qz qlg ugsq, nhzzjfxt zdgh qlg vkkgh hgmwlgs, ngwmag azhg szanhg gdghy afxvqg, ms fr mxtghgj ny qlg mkkhzmwl zr qlg svx.
```
This time, we couldn't search for a plain-text word such as picoCTF, as the flag is not in a usual format. Luckily, we can use a tool like [DCODE](https://www.dcode.fr/monoalphabetic-substitution) to solve this. Our first guess for a substitution encryption method is monoalphabetic substitution, in which every character is replaced with another characters. DCODE has an automatic decryption method that searches for conherent English messages and gets us our flag.
## Flag
`picoCTF{frequency_is_c_over_lambda_ptthttobuc}`