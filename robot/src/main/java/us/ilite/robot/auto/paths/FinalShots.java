package us.ilite.robot.auto.paths;

import com.team319.trajectory.Path;

public class FinalShots extends Path {
   // dt,x,y,left.pos,left.vel,left.acc,left.jerk,center.pos,center.vel,center.acc,center.jerk,right.pos,right.vel,right.acc,right.jerk,heading
	private static final double[][] points = {
				{0.0200,21.2509,-4.2522,0.0024,0.1200,6.0000,0.0000,0.0024,0.1200,6.0000,0.0000,0.0024,0.1200,6.0000,0.0000,-1.1781},
				{0.0200,21.2528,-4.2567,0.0072,0.2400,5.9983,-0.0875,0.0072,0.2400,6.0000,0.0000,0.0072,0.2400,6.0017,0.0875,-1.1781},
				{0.0200,21.2555,-4.2633,0.0144,0.3599,5.9958,-0.1201,0.0144,0.3600,6.0000,0.0000,0.0144,0.3601,6.0042,0.1201,-1.1781},
				{0.0200,21.2592,-4.2722,0.0240,0.4797,5.9919,-0.1960,0.0240,0.4800,6.0000,0.0000,0.0240,0.4803,6.0081,0.1960,-1.1781},
				{0.0200,21.2638,-4.2833,0.0360,0.5995,5.9867,-0.2606,0.0360,0.6000,6.0000,0.0000,0.0360,0.6005,6.0133,0.2606,-1.1781},
				{0.0200,21.2693,-4.2966,0.0504,0.7191,5.9802,-0.3245,0.0504,0.7200,6.0000,0.0000,0.0504,0.7209,6.0198,0.3245,-1.1781},
				{0.0200,21.2757,-4.3121,0.0671,0.8385,5.9725,-0.3876,0.0672,0.8400,6.0000,0.0000,0.0673,0.8415,6.0275,0.3876,-1.1780},
				{0.0200,21.2831,-4.3298,0.0863,0.9578,5.9635,-0.4499,0.0864,0.9600,6.0000,0.0000,0.0865,0.9622,6.0365,0.4499,-1.1780},
				{0.0200,21.2913,-4.3498,0.1078,1.0768,5.9532,-0.5114,0.1080,1.0800,6.0000,0.0000,0.1082,1.0832,6.0468,0.5113,-1.1779},
				{0.0200,21.3005,-4.3719,0.1317,1.1957,5.9418,-0.5719,0.1320,1.2000,6.0000,0.0000,0.1323,1.2043,6.0582,0.5719,-1.1779},
				{0.0200,21.3106,-4.3963,0.1580,1.3143,5.9292,-0.6316,0.1584,1.3200,6.0000,0.0000,0.1588,1.3257,6.0708,0.6316,-1.1777},
				{0.0200,21.3217,-4.4229,0.1867,1.4326,5.9154,-0.6906,0.1872,1.4400,6.0000,0.0000,0.1877,1.4474,6.0846,0.6906,-1.1776},
				{0.0200,21.3336,-4.4518,0.2177,1.5506,5.9004,-0.7490,0.2184,1.5600,6.0000,0.0000,0.2191,1.5694,6.0996,0.7490,-1.1774},
				{0.0200,21.3465,-4.4828,0.2511,1.6683,5.8842,-0.8070,0.2520,1.6800,6.0000,0.0000,0.2529,1.6917,6.1158,0.8070,-1.1772},
				{0.0200,21.3603,-4.5160,0.2868,1.7856,5.8669,-0.8650,0.2880,1.8000,6.0000,0.0000,0.2892,1.8144,6.1331,0.8649,-1.1770},
				{0.0200,21.3751,-4.5515,0.3248,1.9026,5.8485,-0.9231,0.3264,1.9200,6.0000,0.0000,0.3280,1.9374,6.1515,0.9231,-1.1766},
				{0.0200,21.3907,-4.5892,0.3652,2.0191,5.8288,-0.9820,0.3672,2.0400,6.0000,0.0000,0.3692,2.0609,6.1712,0.9820,-1.1763},
				{0.0200,21.4073,-4.6290,0.4079,2.1353,5.8080,-1.0419,0.4104,2.1600,6.0000,0.0000,0.4129,2.1847,6.1920,1.0419,-1.1758},
				{0.0200,21.4249,-4.6711,0.4529,2.2510,5.7859,-1.1035,0.4560,2.2800,6.0000,0.0000,0.4591,2.3090,6.2141,1.1035,-1.1753},
				{0.0200,21.4434,-4.7154,0.5003,2.3663,5.7626,-1.1674,0.5040,2.4000,6.0000,0.0000,0.5077,2.4337,6.2374,1.1674,-1.1746},
				{0.0200,21.4629,-4.7619,0.5499,2.4810,5.7379,-1.2343,0.5544,2.5200,6.0000,0.0000,0.5589,2.5590,6.2621,1.2343,-1.1739},
				{0.0200,21.4833,-4.8106,0.6018,2.5953,5.7118,-1.3050,0.6072,2.6400,6.0000,0.0000,0.6126,2.6847,6.2882,1.3050,-1.1731},
				{0.0200,21.5047,-4.8615,0.6560,2.7090,5.6842,-1.3805,0.6624,2.7600,6.0000,0.0000,0.6688,2.8110,6.3158,1.3805,-1.1722},
				{0.0200,21.5271,-4.9145,0.7124,2.8221,5.6550,-1.4617,0.7200,2.8800,6.0000,0.0000,0.7276,2.9379,6.3450,1.4617,-1.1711},
				{0.0200,21.5505,-4.9698,0.7711,2.9345,5.6240,-1.5498,0.7800,3.0000,6.0000,0.0000,0.7889,3.0655,6.3760,1.5498,-1.1699},
				{0.0200,21.5739,-5.0250,0.8297,2.9293,-0.2621,-294.3016,0.8400,3.0000,6.0000,0.0000,0.8503,3.0707,0.2621,-305.6982,-1.1686},
				{0.0200,21.5975,-5.0802,0.8882,2.9240,-0.2640,-0.0972,0.9000,3.0000,6.0000,0.0000,0.9118,3.0760,0.2640,0.0971,-1.1672},
				{0.0200,21.6211,-5.1354,0.9465,2.9187,-0.2663,-0.1166,0.9600,3.0000,6.0000,0.0000,0.9735,3.0813,0.2663,0.1167,-1.1657},
				{0.0200,21.6447,-5.1905,1.0048,2.9133,-0.2691,-0.1363,1.0200,3.0000,6.0000,0.0000,1.0352,3.0867,0.2691,0.1362,-1.1641},
				{0.0200,21.6685,-5.2456,1.0630,2.9079,-0.2722,-0.1561,1.0800,3.0000,6.0000,0.0000,1.0970,3.0921,0.2722,0.1562,-1.1624},
				{0.0200,21.6924,-5.3006,1.1210,2.9023,-0.2757,-0.1764,1.1400,3.0000,6.0000,0.0000,1.1590,3.0977,0.2757,0.1763,-1.1606},
				{0.0200,21.7164,-5.3556,1.1789,2.8968,-0.2797,-0.1969,1.2000,3.0000,6.0000,0.0000,1.2211,3.1032,0.2797,0.1970,-1.1587},
				{0.0200,21.7405,-5.4106,1.2368,2.8911,-0.2840,-0.2181,1.2600,3.0000,6.0000,0.0000,1.2832,3.1089,0.2840,0.2179,-1.1567},
				{0.0200,21.7647,-5.4655,1.2945,2.8853,-0.2888,-0.2396,1.3200,3.0000,6.0000,0.0000,1.3455,3.1147,0.2888,0.2396,-1.1546},
				{0.0200,21.7890,-5.5203,1.3520,2.8794,-0.2941,-0.2618,1.3800,3.0000,6.0000,0.0000,1.4080,3.1206,0.2940,0.2618,-1.1523},
				{0.0200,21.8134,-5.5751,1.4095,2.8734,-0.2997,-0.2847,1.4400,3.0000,6.0000,0.0000,1.4705,3.1266,0.2997,0.2847,-1.1500},
				{0.0200,21.8380,-5.6299,1.4669,2.8673,-0.3059,-0.3085,1.5000,3.0000,6.0000,0.0000,1.5331,3.1327,0.3059,0.3083,-1.1476},
				{0.0200,21.8627,-5.6845,1.5241,2.8611,-0.3126,-0.3329,1.5600,3.0000,6.0000,0.0000,1.5959,3.1389,0.3126,0.3330,-1.1450},
				{0.0200,21.8876,-5.7392,1.5812,2.8547,-0.3197,-0.3585,1.6200,3.0000,6.0000,0.0000,1.6588,3.1453,0.3197,0.3584,-1.1423},
				{0.0200,21.9126,-5.7937,1.6381,2.8481,-0.3274,-0.3849,1.6800,3.0000,6.0000,0.0000,1.7219,3.1519,0.3274,0.3850,-1.1395},
				{0.0200,21.9378,-5.8482,1.6950,2.8414,-0.3357,-0.4127,1.7400,3.0000,6.0000,0.0000,1.7850,3.1586,0.3357,0.4127,-1.1366},
				{0.0200,21.9631,-5.9026,1.7517,2.8345,-0.3445,-0.4417,1.8000,3.0000,6.0000,0.0000,1.8483,3.1655,0.3445,0.4416,-1.1335},
				{0.0200,21.9886,-5.9569,1.8082,2.8274,-0.3540,-0.4720,1.8600,3.0000,6.0000,0.0000,1.9118,3.1726,0.3540,0.4720,-1.1304},
				{0.0200,22.0142,-6.0111,1.8646,2.8201,-0.3640,-0.5039,1.9200,3.0000,6.0000,0.0000,1.9754,3.1799,0.3640,0.5037,-1.1270},
				{0.0200,22.0401,-6.0653,1.9209,2.8126,-0.3748,-0.5372,1.9800,3.0000,6.0000,0.0000,2.0391,3.1873,0.3748,0.5373,-1.1236},
				{0.0200,22.0661,-6.1193,1.9770,2.8049,-0.3862,-0.5725,2.0400,3.0000,6.0000,0.0000,2.1030,3.1951,0.3862,0.5723,-1.1200},
				{0.0200,22.0924,-6.1733,2.0329,2.7970,-0.3984,-0.6095,2.1000,3.0000,6.0000,0.0000,2.1671,3.2030,0.3984,0.6095,-1.1163},
				{0.0200,22.1188,-6.2271,2.0887,2.7887,-0.4114,-0.6486,2.1600,3.0000,6.0000,0.0000,2.2313,3.2113,0.4114,0.6486,-1.1124},
				{0.0200,22.1455,-6.2809,2.1443,2.7802,-0.4252,-0.6899,2.2200,3.0000,6.0000,0.0000,2.2957,3.2198,0.4252,0.6899,-1.1083},
				{0.0200,22.1724,-6.3345,2.1997,2.7714,-0.4399,-0.7337,2.2800,3.0000,6.0000,0.0000,2.3603,3.2286,0.4399,0.7335,-1.1041},
				{0.0200,22.1995,-6.3880,2.2550,2.7623,-0.4555,-0.7799,2.3400,3.0000,6.0000,0.0000,2.4250,3.2377,0.4555,0.7798,-1.0997},
				{0.0200,22.2268,-6.4414,2.3100,2.7529,-0.4720,-0.8288,2.4000,3.0000,6.0000,0.0000,2.4900,3.2471,0.4720,0.8288,-1.0952},
				{0.0200,22.2544,-6.4947,2.3649,2.7431,-0.4897,-0.8808,2.4600,3.0000,6.0000,0.0000,2.5551,3.2569,0.4896,0.8807,-1.0904},
				{0.0200,22.2823,-6.5479,2.4195,2.7329,-0.5084,-0.9359,2.5200,3.0000,6.0000,0.0000,2.6205,3.2671,0.5084,0.9358,-1.0855},
				{0.0200,22.3104,-6.6009,2.4740,2.7223,-0.5283,-0.9945,2.5800,3.0000,6.0000,0.0000,2.6860,3.2776,0.5282,0.9942,-1.0804},
				{0.0200,22.3388,-6.6537,2.5282,2.7114,-0.5494,-1.0565,2.6400,3.0000,6.0000,0.0000,2.7518,3.2886,0.5494,1.0566,-1.0751},
				{0.0200,22.3675,-6.7064,2.5822,2.6999,-0.5719,-1.1227,2.7000,3.0000,6.0000,0.0000,2.8178,3.3001,0.5718,1.1224,-1.0695},
				{0.0200,22.3965,-6.7589,2.6360,2.6880,-0.5957,-1.1928,2.7600,3.0000,6.0000,0.0000,2.8840,3.3120,0.5957,1.1929,-1.0638},
				{0.0200,22.4258,-6.8113,2.6895,2.6756,-0.6211,-1.2676,2.8200,3.0000,6.0000,0.0000,2.9505,3.3244,0.6210,1.2673,-1.0578},
				{0.0200,22.4554,-6.8635,2.7427,2.6626,-0.6480,-1.3469,2.8800,3.0000,6.0000,0.0000,3.0173,3.3374,0.6480,1.3469,-1.0516},
				{0.0200,22.4853,-6.9155,2.7957,2.6491,-0.6766,-1.4315,2.9400,3.0000,6.0000,0.0000,3.0843,3.3509,0.6766,1.4313,-1.0451},
				{0.0200,22.5156,-6.9673,2.8484,2.6350,-0.7071,-1.5214,3.0000,3.0000,6.0000,0.0000,3.1516,3.3650,0.7070,1.5211,-1.0384},
				{0.0200,22.5462,-7.0189,2.9008,2.6202,-0.7394,-1.6167,3.0600,3.0000,6.0000,0.0000,3.2192,3.3798,0.7393,1.6168,-1.0314},
				{0.0200,22.5772,-7.0702,2.9529,2.6047,-0.7738,-1.7185,3.1200,3.0000,6.0000,0.0000,3.2871,3.3953,0.7737,1.7180,-1.0241},
				{0.0200,22.6086,-7.1214,3.0047,2.5885,-0.8103,-1.8261,3.1800,3.0000,6.0000,0.0000,3.3553,3.4115,0.8102,1.8259,-1.0165},
				{0.0200,22.6404,-7.1723,3.0561,2.5715,-0.8491,-1.9404,3.2400,3.0000,6.0000,0.0000,3.4239,3.4285,0.8490,1.9403,-1.0086},
				{0.0200,22.6726,-7.2229,3.1072,2.5537,-0.8903,-2.0617,3.3000,3.0000,6.0000,0.0000,3.4928,3.4463,0.8903,2.0612,-1.0004},
				{0.0200,22.7052,-7.2733,3.1579,2.5350,-0.9341,-2.1897,3.3600,3.0000,6.0000,0.0000,3.5621,3.4650,0.9340,2.1895,-0.9918},
				{0.0200,22.7383,-7.3233,3.2082,2.5154,-0.9806,-2.3251,3.4200,3.0000,6.0000,0.0000,3.6318,3.4846,0.9805,2.3249,-0.9829},
				{0.0200,22.7718,-7.3731,3.2581,2.4948,-1.0300,-2.4679,3.4800,3.0000,6.0000,0.0000,3.7019,3.5052,1.0299,2.4672,-0.9736},
				{0.0200,22.8057,-7.4226,3.3075,2.4732,-1.0823,-2.6175,3.5400,3.0000,6.0000,0.0000,3.7724,3.5268,1.0822,2.6174,-0.9639},
				{0.0200,22.8402,-7.4717,3.3566,2.4504,-1.1378,-2.7747,3.6000,3.0000,6.0000,0.0000,3.8434,3.5496,1.1377,2.7738,-0.9537},
				{0.0200,22.8752,-7.5204,3.4051,2.4265,-1.1966,-2.9378,3.6600,3.0000,6.0000,0.0000,3.9149,3.5735,1.1965,2.9378,-0.9432},
				{0.0200,22.9107,-7.5688,3.4531,2.4013,-1.2587,-3.1078,3.7200,3.0000,6.0000,0.0000,3.9869,3.5987,1.2586,3.1068,-0.9321},
				{0.0200,22.9467,-7.6168,3.5006,2.3748,-1.3244,-3.2824,3.7800,3.0000,6.0000,0.0000,4.0594,3.6252,1.3242,3.2818,-0.9206},
				{0.0200,22.9833,-7.6643,3.5475,2.3469,-1.3936,-3.4609,3.8400,3.0000,6.0000,0.0000,4.1324,3.6530,1.3935,3.4604,-0.9086},
				{0.0200,23.0205,-7.7114,3.5939,2.3176,-1.4664,-3.6416,3.9000,3.0000,6.0000,0.0000,4.2061,3.6824,1.4663,3.6409,-0.8960},
				{0.0200,23.0583,-7.7580,3.6396,2.2867,-1.5429,-3.8221,3.9600,3.0000,6.0000,0.0000,4.2804,3.7132,1.5427,3.8211,-0.8828},
				{0.0200,23.0967,-7.8041,3.6847,2.2543,-1.6229,-3.9992,4.0200,3.0000,6.0000,0.0000,4.3553,3.7457,1.6227,3.9983,-0.8691},
				{0.0200,23.1358,-7.8496,3.7291,2.2202,-1.7062,-4.1691,4.0800,3.0000,6.0000,0.0000,4.4309,3.7798,1.7060,4.1683,-0.8547},
				{0.0200,23.1755,-7.8946,3.7728,2.1843,-1.7928,-4.3271,4.1400,3.0000,6.0000,0.0000,4.5072,3.8156,1.7925,4.3260,-0.8397},
				{0.0200,23.2159,-7.9390,3.8157,2.1467,-1.8821,-4.4670,4.2000,3.0000,6.0000,0.0000,4.5842,3.8533,1.8819,4.4657,-0.8239},
				{0.0200,23.2570,-7.9826,3.8579,2.1072,-1.9737,-4.5812,4.2600,3.0000,6.0000,0.0000,4.6621,3.8927,1.9735,4.5799,-0.8075},
				{0.0200,23.2989,-8.0256,3.8992,2.0659,-2.0670,-4.6608,4.3200,3.0000,6.0000,0.0000,4.7408,3.9341,2.0666,4.6597,-0.7903},
				{0.0200,23.3415,-8.0679,3.9397,2.0226,-2.1609,-4.6955,4.3800,3.0000,6.0000,0.0000,4.8203,3.9773,2.1605,4.6935,-0.7723},
				{0.0200,23.3849,-8.1094,3.9792,1.9775,-2.2543,-4.6718,4.4400,3.0000,6.0000,0.0000,4.9008,4.0224,2.2539,4.6706,-0.7534},
				{0.0200,23.4290,-8.1500,4.0178,1.9306,-2.3458,-4.5762,4.5000,3.0000,6.0000,0.0000,4.9822,4.0693,2.3454,4.5742,-0.7337},
				{0.0200,23.4740,-8.1897,4.0555,1.8820,-2.4337,-4.3914,4.5600,3.0000,6.0000,0.0000,5.0645,4.1179,2.4332,4.3898,-0.7131},
				{0.0200,23.5198,-8.2285,4.0921,1.8316,-2.5157,-4.0997,4.6200,3.0000,6.0000,0.0000,5.1479,4.1682,2.5152,4.0978,-0.6916},
				{0.0200,23.5664,-8.2662,4.1277,1.7799,-2.5893,-3.6813,4.6800,3.0000,6.0000,0.0000,5.2323,4.2200,2.5888,3.6796,-0.6691},
				{0.0200,23.6139,-8.3029,4.1622,1.7268,-2.6516,-3.1161,4.7400,3.0000,6.0000,0.0000,5.3177,4.2730,2.6510,3.1144,-0.6456},
				{0.0200,23.6623,-8.3384,4.1957,1.6728,-2.6993,-2.3842,4.8000,3.0000,6.0000,0.0000,5.4043,4.3270,2.6987,2.3822,-0.6211},
				{0.0200,23.7115,-8.3727,4.2280,1.6183,-2.7286,-1.4674,4.8600,3.0000,6.0000,0.0000,5.4919,4.3816,2.7280,1.4661,-0.5957},
				{0.0200,23.7616,-8.4057,4.2593,1.5636,-2.7357,-0.3518,4.9200,3.0000,6.0000,0.0000,5.5806,4.4363,2.7350,0.3502,-0.5692},
				{0.0200,23.8126,-8.4373,4.2895,1.5092,-2.7162,0.9715,4.9800,3.0000,6.0000,0.0000,5.6705,4.4906,2.7156,-0.9722,-0.5417},
				{0.0200,23.8644,-8.4675,4.3186,1.4559,-2.6662,2.5015,5.0400,3.0000,6.0000,0.0000,5.7613,4.5439,2.6655,-2.5024,-0.5132},
				{0.0200,23.9171,-8.4962,4.3467,1.4043,-2.5817,4.2270,5.1000,3.0000,6.0000,0.0000,5.8532,4.5955,2.5810,-4.2269,-0.4838},
				{0.0200,23.9706,-8.5233,4.3738,1.3551,-2.4592,6.1216,5.1600,3.0000,6.0000,0.0000,5.9461,4.6447,2.4586,-6.1210,-0.4535},
				{0.0200,24.0250,-8.5488,4.4000,1.3092,-2.2964,8.1439,5.2200,3.0000,6.0000,0.0000,6.0399,4.6906,2.2957,-8.1426,-0.4223},
				{0.0200,24.0801,-8.5725,4.4253,1.2673,-2.0917,10.2353,5.2800,3.0000,6.0000,0.0000,6.1346,4.7324,2.0910,-10.2332,-0.3904},
				{0.0200,24.1359,-8.5944,4.4499,1.2304,-1.8452,12.3215,5.3400,3.0000,6.0000,0.0000,6.2300,4.7693,1.8447,-12.3186,-0.3578},
				{0.0200,24.1925,-8.6145,4.4739,1.1992,-1.5589,14.3157,5.4000,3.0000,6.0000,0.0000,6.3260,4.8005,1.5584,-14.3118,-0.3246},
				{0.0200,24.2496,-8.6327,4.4974,1.1745,-1.2364,16.1232,5.4600,3.0000,6.0000,0.0000,6.4225,4.8252,1.2361,-16.1186,-0.2909},
				{0.0200,24.3074,-8.6489,4.5206,1.1568,-0.8835,17.6494,5.5200,3.0000,6.0000,0.0000,6.5194,4.8429,0.8832,-17.6442,-0.2570},
				{0.0200,24.3657,-8.6632,4.5435,1.1467,-0.5073,18.8077,5.5800,3.0000,6.0000,0.0000,6.6164,4.8530,0.5071,-18.8019,-0.2228},
				{0.0200,24.4244,-8.6754,4.5664,1.1444,-0.1167,19.5286,5.6400,3.0000,6.0000,0.0000,6.7135,4.8553,0.1167,-19.5224,-0.1886},
				{0.0200,24.4835,-8.6857,4.5894,1.1499,0.2786,19.7668,5.7000,3.0000,6.0000,0.0000,6.8105,4.8498,-0.2785,-19.7605,-0.1545},
				{0.0200,24.5430,-8.6939,4.6126,1.1633,0.6687,19.5069,5.7600,3.0000,6.0000,0.0000,6.9072,4.8364,-0.6685,-19.5008,-0.1207},
				{0.0200,24.6026,-8.7001,4.6363,1.1842,1.0440,18.7650,5.8200,3.0000,6.0000,0.0000,7.0036,4.8155,-1.0437,-18.7593,-0.0872},
				{0.0200,24.6625,-8.7043,4.6606,1.2121,1.3958,17.5866,5.8800,3.0000,6.0000,0.0000,7.0993,4.7876,-1.3953,-17.5814,-0.0542},
				{0.0200,24.7224,-8.7066,4.6855,1.2464,1.7166,16.0419,5.9400,3.0000,6.0000,0.0000,7.1944,4.7533,-1.7161,-16.0375,-0.0219},
				{0.0200,24.7824,-8.7070,4.7112,1.2865,2.0010,14.2179,6.0000,3.0000,6.0000,0.0000,7.2886,4.7133,-2.0004,-14.2142,0.0097},
				{0.0200,24.8424,-8.7055,4.7379,1.3314,2.2452,12.2095,6.0600,3.0000,6.0000,0.0000,7.3820,4.6684,-2.2445,-12.2067,0.0404},
				{0.0200,24.9023,-8.7022,4.7655,1.3803,2.4474,10.1115,6.1200,3.0000,6.0000,0.0000,7.4744,4.6195,-2.4467,-10.1097,0.0703},
				{0.0200,24.9621,-8.6971,4.7941,1.4325,2.6076,8.0112,6.1800,3.0000,6.0000,0.0000,7.5657,4.5673,-2.6069,-8.0100,0.0992},
				{0.0200,25.0217,-8.6903,4.8239,1.4870,2.7273,5.9827,6.2400,3.0000,6.0000,0.0000,7.6560,4.5128,-2.7266,-5.9823,0.1271},
				{0.0200,25.0811,-8.6819,4.8547,1.5432,2.8090,4.0845,6.3000,3.0000,6.0000,0.0000,7.7451,4.4566,-2.8082,-4.0848,0.1539},
				{0.0200,25.1403,-8.6719,4.8867,1.6003,2.8561,2.3582,6.3600,3.0000,6.0000,0.0000,7.8331,4.3995,-2.8554,-2.3589,0.1797},
				{0.0200,25.1992,-8.6605,4.9199,1.6578,2.8727,0.8294,6.4200,3.0000,6.0000,0.0000,7.9200,4.3421,-2.8720,-0.8306,0.2045},
				{0.0200,25.2578,-8.6476,4.9542,1.7150,2.8629,-0.4903,6.4800,3.0000,6.0000,0.0000,8.0057,4.2848,-2.8623,0.4888,0.2282},
				{0.0200,25.3161,-8.6333,4.9896,1.7716,2.8309,-1.6007,6.5400,3.0000,6.0000,0.0000,8.0902,4.2282,-2.8303,1.5990,0.2508},
				{0.0200,25.3740,-8.6178,5.0262,1.8273,2.7807,-2.5106,6.6000,3.0000,6.0000,0.0000,8.1737,4.1726,-2.7801,2.5088,0.2724},
				{0.0200,25.4316,-8.6011,5.0638,1.8816,2.7160,-3.2345,6.6600,3.0000,6.0000,0.0000,8.2560,4.1183,-2.7155,3.2325,0.2930},
				{0.0200,25.4889,-8.5832,5.1025,1.9344,2.6402,-3.7906,6.7200,3.0000,6.0000,0.0000,8.3374,4.0655,-2.6397,3.7887,0.3127},
				{0.0200,25.5458,-8.5642,5.1422,1.9855,2.5562,-4.1992,6.7800,3.0000,6.0000,0.0000,8.4176,4.0144,-2.5557,4.1974,0.3314},
				{0.0200,25.6024,-8.5442,5.1829,2.0348,2.4666,-4.4807,6.8400,3.0000,6.0000,0.0000,8.4969,3.9651,-2.4662,4.4787,0.3492},
				{0.0200,25.6586,-8.5231,5.2245,2.0823,2.3735,-4.6547,6.9000,3.0000,6.0000,0.0000,8.5753,3.9176,-2.3731,4.6530,0.3661},
				{0.0200,25.7144,-8.5012,5.2671,2.1279,2.2787,-4.7397,6.9600,3.0000,6.0000,0.0000,8.6527,3.8721,-2.2783,4.7381,0.3822},
				{0.0200,25.7699,-8.4784,5.3105,2.1715,2.1836,-4.7523,7.0200,3.0000,6.0000,0.0000,8.7293,3.8284,-2.1833,4.7507,0.3974},
				{0.0200,25.8251,-8.4548,5.3548,2.2133,2.0895,-4.7071,7.0800,3.0000,6.0000,0.0000,8.8050,3.7866,-2.0892,4.7057,0.4119},
				{0.0200,25.8799,-8.4304,5.3998,2.2533,1.9972,-4.6167,7.1400,3.0000,6.0000,0.0000,8.8800,3.7467,-1.9969,4.6154,0.4257},
				{0.0200,25.9344,-8.4052,5.4457,2.2914,1.9073,-4.4920,7.2000,3.0000,6.0000,0.0000,8.9541,3.7085,-1.9071,4.4908,0.4387},
				{0.0200,25.9885,-8.3794,5.4922,2.3278,1.8205,-4.3420,7.2600,3.0000,6.0000,0.0000,9.0276,3.6721,-1.8203,4.3408,0.4511},
				{0.0200,26.0424,-8.3529,5.5395,2.3626,1.7370,-4.1740,7.3200,3.0000,6.0000,0.0000,9.1003,3.6374,-1.7368,4.1730,0.4629},
				{0.0200,26.0959,-8.3258,5.5874,2.3957,1.6571,-3.9943,7.3800,3.0000,6.0000,0.0000,9.1724,3.6042,-1.6569,3.9933,0.4740},
				{0.0200,26.1491,-8.2982,5.6359,2.4273,1.5810,-3.8076,7.4400,3.0000,6.0000,0.0000,9.2439,3.5726,-1.5808,3.8068,0.4846},
				{0.0200,26.2021,-8.2700,5.6851,2.4575,1.5086,-3.6179,7.5000,3.0000,6.0000,0.0000,9.3147,3.5425,-1.5085,3.6172,0.4946},
				{0.0200,26.2548,-8.2412,5.7348,2.4863,1.4400,-3.4283,7.5600,3.0000,6.0000,0.0000,9.3850,3.5137,-1.4399,3.4275,0.5040},
				{0.0200,26.3072,-8.2120,5.7851,2.5138,1.3752,-3.2408,7.6200,3.0000,6.0000,0.0000,9.4547,3.4862,-1.3751,3.2403,0.5130},
				{0.0200,26.3593,-8.1823,5.8359,2.5401,1.3141,-3.0576,7.6800,3.0000,6.0000,0.0000,9.5239,3.4599,-1.3140,3.0569,0.5215},
				{0.0200,26.4112,-8.1522,5.8872,2.5652,1.2565,-2.8795,7.7400,3.0000,6.0000,0.0000,9.5926,3.4348,-1.2564,2.8791,0.5295},
				{0.0200,26.4629,-8.1217,5.9390,2.5893,1.2023,-2.7077,7.8000,3.0000,6.0000,0.0000,9.6608,3.4107,-1.2022,2.7072,0.5371},
				{0.0200,26.5143,-8.0909,5.9912,2.6123,1.1515,-2.5427,7.8600,3.0000,6.0000,0.0000,9.7286,3.3877,-1.1514,2.5423,0.5442},
				{0.0200,26.5655,-8.0596,6.0439,2.6344,1.1038,-2.3849,7.9200,3.0000,6.0000,0.0000,9.7959,3.3656,-1.1037,2.3845,0.5510},
				{0.0200,26.6166,-8.0280,6.0970,2.6556,1.0591,-2.2343,7.9800,3.0000,6.0000,0.0000,9.8628,3.3444,-1.0590,2.2340,0.5573},
				{0.0200,26.6674,-7.9962,6.1506,2.6759,1.0173,-2.0911,8.0400,3.0000,6.0000,0.0000,9.9293,3.3241,-1.0172,2.0908,0.5633},
				{0.0200,26.7180,-7.9640,6.2045,2.6955,0.9782,-1.9551,8.1000,3.0000,6.0000,0.0000,9.9953,3.3045,-0.9781,1.9548,0.5689},
				{0.0200,26.7685,-7.9315,6.2587,2.7143,0.9416,-1.8262,8.1600,3.0000,6.0000,0.0000,10.0611,3.2857,-0.9416,1.8260,0.5742},
				{0.0200,26.8188,-7.8988,6.3134,2.7325,0.9076,-1.7041,8.2200,3.0000,6.0000,0.0000,10.1264,3.2675,-0.9075,1.7038,0.5791},
				{0.0200,26.8689,-7.8658,6.3684,2.7500,0.8758,-1.5885,8.2800,3.0000,6.0000,0.0000,10.1914,3.2500,-0.8758,1.5883,0.5837},
				{0.0200,26.9189,-7.8327,6.4237,2.7669,0.8462,-1.4792,8.3400,3.0000,6.0000,0.0000,10.2561,3.2331,-0.8462,1.4790,0.5880},
				{0.0200,26.9688,-7.7993,6.4794,2.7833,0.8187,-1.3758,8.4000,3.0000,6.0000,0.0000,10.3204,3.2167,-0.8187,1.3757,0.5920},
				{0.0200,27.0185,-7.7657,6.5354,2.7991,0.7931,-1.2781,8.4600,3.0000,6.0000,0.0000,10.3844,3.2009,-0.7931,1.2778,0.5957},
				{0.0200,27.0681,-7.7320,6.5917,2.8145,0.7694,-1.1855,8.5200,3.0000,6.0000,0.0000,10.4481,3.1855,-0.7694,1.1854,0.5991},
				{0.0200,27.1176,-7.6980,6.6483,2.8295,0.7475,-1.0979,8.5800,3.0000,6.0000,0.0000,10.5115,3.1705,-0.7474,1.0978,0.6023},
				{0.0200,27.1670,-7.6640,6.7051,2.8440,0.7272,-1.0150,8.6400,3.0000,6.0000,0.0000,10.5747,3.1560,-0.7271,1.0149,0.6051},
				{0.0200,27.2163,-7.6298,6.7623,2.8582,0.7084,-0.9364,8.7000,3.0000,6.0000,0.0000,10.6375,3.1418,-0.7084,0.9362,0.6077},
				{0.0200,27.2655,-7.5955,6.8197,2.8720,0.6912,-0.8618,8.7600,3.0000,6.0000,0.0000,10.7001,3.1280,-0.6912,0.8617,0.6101},
				{0.0200,27.3147,-7.5610,6.8775,2.8855,0.6754,-0.7909,8.8200,3.0000,6.0000,0.0000,10.7624,3.1145,-0.6754,0.7908,0.6122},
				{0.0200,27.3637,-7.5265,6.9354,2.8987,0.6609,-0.7236,8.8800,3.0000,6.0000,0.0000,10.8244,3.1013,-0.6609,0.7235,0.6141},
				{0.0200,27.4127,-7.4919,6.9937,2.9117,0.6477,-0.6594,8.9400,3.0000,6.0000,0.0000,10.8861,3.0883,-0.6477,0.6593,0.6157},
				{0.0200,27.4617,-7.4572,7.0522,2.9244,0.6358,-0.5983,9.0000,3.0000,6.0000,0.0000,10.9477,3.0756,-0.6358,0.5982,0.6171},
				{0.0200,27.5106,-7.4225,7.1109,2.9369,0.6250,-0.5399,9.0600,3.0000,6.0000,0.0000,11.0089,3.0631,-0.6250,0.5398,0.6183},
				{0.0200,27.5595,-7.3877,7.1699,2.9492,0.6153,-0.4840,9.1200,3.0000,6.0000,0.0000,11.0699,3.0508,-0.6153,0.4840,0.6192},
				{0.0200,27.6083,-7.3528,7.2291,2.9613,0.6067,-0.4305,9.1800,3.0000,6.0000,0.0000,11.1307,3.0387,-0.6067,0.4304,0.6199},
				{0.0200,27.6572,-7.3179,7.2886,2.9733,0.5991,-0.3792,9.2400,3.0000,6.0000,0.0000,11.1912,3.0267,-0.5991,0.3791,0.6204},
				{0.0200,27.7060,-7.2831,7.3483,2.9852,0.5925,-0.3299,9.3000,3.0000,6.0000,0.0000,11.2515,3.0148,-0.5925,0.3298,0.6207},
				{0.0200,27.7548,-7.2482,7.4082,2.9969,0.5868,-0.2824,9.3600,3.0000,6.0000,0.0000,11.3116,3.0031,-0.5868,0.2823,0.6207},
				{0.0200,27.8036,-7.2133,7.4684,3.0086,0.5821,-0.2366,9.4200,3.0000,6.0000,0.0000,11.3714,2.9914,-0.5821,0.2365,0.6206},
				{0.0200,27.8524,-7.1784,7.5288,3.0201,0.5783,-0.1923,9.4800,3.0000,6.0000,0.0000,11.4310,2.9799,-0.5783,0.1923,0.6202},
				{0.0200,27.9012,-7.1435,7.5894,3.0316,0.5753,-0.1495,9.5400,3.0000,6.0000,0.0000,11.4904,2.9684,-0.5753,0.1495,0.6196},
				{0.0200,27.9501,-7.1087,7.6503,3.0431,0.5731,-0.1080,9.6000,3.0000,6.0000,0.0000,11.5495,2.9569,-0.5731,0.1080,0.6188},
				{0.0200,27.9990,-7.0739,7.7114,3.0545,0.5718,-0.0678,9.6600,3.0000,6.0000,0.0000,11.6084,2.9455,-0.5718,0.0677,0.6178},
				{0.0200,28.0479,-7.0392,7.7727,3.0659,0.5712,-0.0287,9.7200,3.0000,6.0000,0.0000,11.6671,2.9341,-0.5712,0.0286,0.6166},
				{0.0200,28.0969,-7.0045,7.8342,3.0774,0.5714,0.0093,9.7800,3.0000,6.0000,0.0000,11.7256,2.9226,-0.5714,-0.0094,0.6152},
				{0.0200,28.1459,-6.9699,7.8960,3.0888,0.5723,0.0463,9.8400,3.0000,6.0000,0.0000,11.7838,2.9112,-0.5723,-0.0464,0.6136},
				{0.0200,28.1950,-6.9354,7.9580,3.1003,0.5739,0.0824,9.9000,3.0000,6.0000,0.0000,11.8418,2.8997,-0.5740,-0.0824,0.6117},
				{0.0200,28.2442,-6.9010,8.0203,3.1118,0.5763,0.1175,9.9600,3.0000,6.0000,0.0000,11.8996,2.8882,-0.5763,-0.1176,0.6096},
				{0.0200,28.2934,-6.8667,8.0827,3.1234,0.5793,0.1518,10.0200,3.0000,6.0000,0.0000,11.9571,2.8766,-0.5793,-0.1518,0.6074},
				{0.0200,28.3427,-6.8325,8.1454,3.1351,0.5830,0.1851,10.0800,3.0000,6.0000,0.0000,12.0144,2.8649,-0.5830,-0.1852,0.6049},
				{0.0200,28.3921,-6.7985,8.2084,3.1468,0.5874,0.2176,10.1400,3.0000,6.0000,0.0000,12.0714,2.8532,-0.5874,-0.2176,0.6022},
				{0.0200,28.4416,-6.7646,8.2715,3.1587,0.5924,0.2491,10.2000,3.0000,6.0000,0.0000,12.1283,2.8413,-0.5924,-0.2492,0.5992},
				{0.0200,28.4912,-6.7308,8.3349,3.1706,0.5980,0.2797,10.2600,3.0000,6.0000,0.0000,12.1849,2.8294,-0.5980,-0.2797,0.5961},
				{0.0200,28.5409,-6.6972,8.3986,3.1827,0.6041,0.3092,10.3200,3.0000,6.0000,0.0000,12.2412,2.8173,-0.6042,-0.3092,0.5927},
				{0.0200,28.5907,-6.6638,8.4625,3.1949,0.6109,0.3376,10.3800,3.0000,6.0000,0.0000,12.2973,2.8051,-0.6109,-0.3377,0.5891},
				{0.0200,28.6407,-6.6305,8.5266,3.2073,0.6182,0.3649,10.4400,3.0000,6.0000,0.0000,12.3532,2.7927,-0.6182,-0.3649,0.5853},
				{0.0200,28.6908,-6.5975,8.5910,3.2198,0.6260,0.3907,10.5000,3.0000,6.0000,0.0000,12.4088,2.7802,-0.6260,-0.3908,0.5813},
				{0.0200,28.7410,-6.5647,8.6557,3.2325,0.6343,0.4151,10.5600,3.0000,6.0000,0.0000,12.4641,2.7675,-0.6343,-0.4151,0.5770},
				{0.0200,28.7913,-6.5320,8.7206,3.2454,0.6431,0.4377,10.6200,3.0000,6.0000,0.0000,12.5192,2.7546,-0.6431,-0.4379,0.5725},
				{0.0200,28.8418,-6.4997,8.7858,3.2584,0.6522,0.4587,10.6800,3.0000,6.0000,0.0000,12.5740,2.7416,-0.6523,-0.4586,0.5677},
				{0.0200,28.8925,-6.4675,8.8512,3.2716,0.6618,0.4772,10.7400,3.0000,6.0000,0.0000,12.6286,2.7284,-0.6618,-0.4774,0.5627},
				{0.0200,28.9433,-6.4356,8.9169,3.2851,0.6717,0.4935,10.8000,3.0000,6.0000,0.0000,12.6829,2.7149,-0.6717,-0.4936,0.5574},
				{0.0200,28.9943,-6.4040,8.9829,3.2987,0.6818,0.5070,10.8600,3.0000,6.0000,0.0000,12.7369,2.7013,-0.6818,-0.5070,0.5519},
				{0.0200,29.0455,-6.3727,9.0491,3.3125,0.6921,0.5172,10.9200,3.0000,6.0000,0.0000,12.7907,2.6874,-0.6922,-0.5175,0.5462},
				{0.0200,29.0969,-6.3417,9.1157,3.3266,0.7026,0.5242,10.9800,3.0000,6.0000,0.0000,12.8442,2.6734,-0.7027,-0.5241,0.5401},
				{0.0200,29.1484,-6.3110,9.1825,3.3409,0.7132,0.5268,11.0400,3.0000,6.0000,0.0000,12.8973,2.6591,-0.7132,-0.5270,0.5339},
				{0.0200,29.2002,-6.2807,9.2496,3.3553,0.7237,0.5251,11.1000,3.0000,6.0000,0.0000,12.9502,2.6447,-0.7237,-0.5252,0.5273},
				{0.0200,29.2522,-6.2506,9.3170,3.3700,0.7340,0.5182,11.1600,3.0000,6.0000,0.0000,13.0028,2.6300,-0.7341,-0.5183,0.5205},
				{0.0200,29.3043,-6.2210,9.3847,3.3849,0.7441,0.5056,11.2200,3.0000,6.0000,0.0000,13.0551,2.6151,-0.7442,-0.5057,0.5134},
				{0.0200,29.3567,-6.1917,9.4527,3.4000,0.7539,0.4865,11.2800,3.0000,6.0000,0.0000,13.1071,2.6000,-0.7539,-0.4867,0.5060},
				{0.0200,29.4093,-6.1628,9.5210,3.4152,0.7631,0.4604,11.3400,3.0000,6.0000,0.0000,13.1588,2.5847,-0.7631,-0.4604,0.4984},
				{0.0200,29.4621,-6.1344,9.5896,3.4307,0.7716,0.4262,11.4000,3.0000,6.0000,0.0000,13.2102,2.5693,-0.7717,-0.4264,0.4904},
				{0.0200,29.5151,-6.1063,9.6585,3.4463,0.7793,0.3833,11.4600,3.0000,6.0000,0.0000,13.2613,2.5537,-0.7793,-0.3834,0.4822},
				{0.0200,29.5684,-6.0787,9.7278,3.4620,0.7859,0.3307,11.5200,3.0000,6.0000,0.0000,13.3120,2.5380,-0.7859,-0.3307,0.4737},
				{0.0200,29.6219,-6.0516,9.7973,3.4778,0.7912,0.2674,11.5800,3.0000,6.0000,0.0000,13.3625,2.5222,-0.7913,-0.2675,0.4649},
				{0.0200,29.6757,-6.0249,9.8672,3.4937,0.7951,0.1925,11.6400,3.0000,6.0000,0.0000,13.4126,2.5063,-0.7951,-0.1927,0.4558},
				{0.0200,29.7297,-5.9988,9.9374,3.5096,0.7972,0.1052,11.7000,3.0000,6.0000,0.0000,13.4624,2.4903,-0.7972,-0.1052,0.4464},
				{0.0200,29.7839,-5.9731,10.0079,3.5256,0.7973,0.0042,11.7600,3.0000,6.0000,0.0000,13.5119,2.4744,-0.7973,-0.0043,0.4367},
				{0.0200,29.8384,-5.9480,10.0787,3.5415,0.7950,-0.1112,11.8200,3.0000,6.0000,0.0000,13.5611,2.4585,-0.7951,0.1110,0.4267},
				{0.0200,29.8932,-5.9235,10.1499,3.5573,0.7902,-0.2419,11.8800,3.0000,6.0000,0.0000,13.6099,2.4427,-0.7903,0.2419,0.4164},
				{0.0200,29.9482,-5.8995,10.2213,3.5729,0.7824,-0.3889,11.9400,3.0000,6.0000,0.0000,13.6585,2.4270,-0.7825,0.3888,0.4059},
				{0.0200,30.0034,-5.8761,10.2931,3.5884,0.7714,-0.5528,12.0000,3.0000,6.0000,0.0000,13.7067,2.4116,-0.7714,0.5527,0.3950},
				{0.0200,30.0589,-5.8533,10.3652,3.6035,0.7567,-0.7341,12.0600,3.0000,6.0000,0.0000,13.7546,2.3965,-0.7568,0.7341,0.3839},
				{0.0200,30.1147,-5.8312,10.4375,3.6183,0.7380,-0.9334,12.1200,3.0000,6.0000,0.0000,13.8023,2.3817,-0.7381,0.9334,0.3725},
				{0.0200,30.1707,-5.8096,10.5102,3.6326,0.7150,-1.1506,12.1800,3.0000,6.0000,0.0000,13.8496,2.3674,-0.7151,1.1506,0.3609},
				{0.0200,30.2269,-5.7888,10.5831,3.6463,0.6873,-1.3857,12.2400,3.0000,6.0000,0.0000,13.8967,2.3537,-0.6874,1.3858,0.3489},
				{0.0200,30.2834,-5.7686,10.6563,3.6594,0.6545,-1.6382,12.3000,3.0000,6.0000,0.0000,13.9435,2.3406,-0.6546,1.6383,0.3368},
				{0.0200,30.3402,-5.7491,10.7297,3.6717,0.6164,-1.9072,12.3600,3.0000,6.0000,0.0000,13.9901,2.3282,-0.6164,1.9075,0.3244},
				{0.0200,30.3972,-5.7304,10.8034,3.6832,0.5725,-2.1918,12.4200,3.0000,6.0000,0.0000,14.0364,2.3168,-0.5726,2.1919,0.3118},
				{0.0200,30.4544,-5.7123,10.8773,3.6936,0.5227,-2.4900,12.4800,3.0000,6.0000,0.0000,14.0825,2.3063,-0.5228,2.4903,0.2990},
				{0.0200,30.5119,-5.6950,10.9513,3.7030,0.4667,-2.8000,12.5400,3.0000,6.0000,0.0000,14.1285,2.2970,-0.4668,2.8002,0.2861},
				{0.0200,30.5695,-5.6785,11.0255,3.7111,0.4044,-3.1190,12.6000,3.0000,6.0000,0.0000,14.1742,2.2889,-0.4044,3.1194,0.2730},
				{0.0200,30.6274,-5.6627,11.0999,3.7178,0.3355,-3.4444,12.6600,3.0000,6.0000,0.0000,14.2199,2.2822,-0.3355,3.4448,0.2597},
				{0.0200,30.6855,-5.6477,11.1744,3.7230,0.2600,-3.7726,12.7200,3.0000,6.0000,0.0000,14.2654,2.2770,-0.2601,3.7731,0.2464},
				{0.0200,30.7438,-5.6334,11.2489,3.7265,0.1780,-4.1002,12.7800,3.0000,6.0000,0.0000,14.3109,2.2734,-0.1780,4.1007,0.2330},
				{0.0200,30.8023,-5.6200,11.3235,3.7283,0.0896,-4.4232,12.8400,3.0000,6.0000,0.0000,14.3563,2.2716,-0.0896,4.4237,0.2196},
				{0.0200,30.8609,-5.6073,11.3980,3.7282,-0.0052,-4.7375,12.9000,3.0000,6.0000,0.0000,14.4018,2.2717,0.0052,4.7381,0.2062},
				{0.0200,30.9197,-5.5954,11.4725,3.7261,-0.1060,-5.0391,12.9600,3.0000,6.0000,0.0000,14.4472,2.2739,0.1060,5.0397,0.1928},
				{0.0200,30.9787,-5.5843,11.5470,3.7218,-0.2125,-5.3241,13.0200,3.0000,6.0000,0.0000,14.4928,2.2781,0.2125,5.3248,0.1795},
				{0.0200,31.0378,-5.5740,11.6213,3.7154,-0.3242,-5.5888,13.0800,3.0000,6.0000,0.0000,14.5385,2.2846,0.3243,5.5895,0.1663},
				{0.0200,31.0970,-5.5644,11.6954,3.7065,-0.4408,-5.8299,13.1400,3.0000,6.0000,0.0000,14.5844,2.2934,0.4409,5.8306,0.1533},
				{0.0200,31.1564,-5.5556,11.7693,3.6953,-0.5617,-6.0445,13.2000,3.0000,6.0000,0.0000,14.6305,2.3047,0.5618,6.0452,0.1404},
				{0.0200,31.2158,-5.5476,11.8430,3.6816,-0.6863,-6.2307,13.2600,3.0000,6.0000,0.0000,14.6768,2.3184,0.6864,6.2313,0.1279},
				{0.0200,31.2754,-5.5403,11.9163,3.6653,-0.8141,-6.3869,13.3200,3.0000,6.0000,0.0000,14.7235,2.3347,0.8142,6.3875,0.1156},
				{0.0200,31.3350,-5.5338,11.9892,3.6464,-0.9443,-6.5126,13.3800,3.0000,6.0000,0.0000,14.7706,2.3536,0.9444,6.5132,0.1037},
				{0.0200,31.3947,-5.5279,12.0617,3.6249,-1.0765,-6.6080,13.4400,3.0000,6.0000,0.0000,14.8181,2.3751,1.0766,6.6085,0.0922},
				{0.0200,31.4545,-5.5227,12.1337,3.6007,-1.2100,-6.6741,13.5000,3.0000,6.0000,0.0000,14.8661,2.3993,1.2101,6.6746,0.0811},
				{0.0200,31.5143,-5.5182,12.2052,3.5738,-1.3442,-6.7127,13.5600,3.0000,6.0000,0.0000,14.9146,2.4262,1.3444,6.7131,0.0705},
				{0.0200,31.5718,-5.5144,12.2732,3.4031,-8.5371,-359.6421,13.6176,2.8800,-6.0000,0.0000,14.9617,2.3569,-3.4627,-240.3504,0.0609},
				{0.0200,31.6269,-5.5113,12.3379,3.2335,-8.4785,2.9282,13.6728,2.7600,-6.0000,0.0000,15.0075,2.2865,-3.5213,-2.9303,0.0522},
				{0.0200,31.6797,-5.5087,12.3992,3.0655,-8.3988,3.9860,13.7256,2.6400,-6.0000,0.0000,15.0518,2.2145,-3.6010,-3.9880,0.0443},
				{0.0200,31.7300,-5.5067,12.4572,2.8995,-8.3009,4.8962,13.7760,2.5200,-6.0000,0.0000,15.0946,2.1405,-3.6990,-4.8980,0.0373},
				{0.0200,31.7780,-5.5050,12.5119,2.7357,-8.1877,5.6600,13.8240,2.4000,-6.0000,0.0000,15.1359,2.0642,-3.8122,-5.6616,0.0311},
				{0.0200,31.8236,-5.5037,12.5634,2.5745,-8.0620,6.2814,13.8696,2.2800,-6.0000,0.0000,15.1756,1.9855,-3.9379,-6.2828,0.0257},
				{0.0200,31.8668,-5.5027,12.6117,2.4160,-7.9267,6.7663,13.9128,2.1600,-6.0000,0.0000,15.2136,1.9040,-4.0732,-6.7675,0.0210},
				{0.0200,31.9076,-5.5020,12.6569,2.2603,-7.7843,7.1220,13.9536,2.0400,-6.0000,0.0000,15.2500,1.8197,-4.2157,-7.1230,0.0169},
				{0.0200,31.9460,-5.5014,12.6991,2.1075,-7.6371,7.3562,13.9920,1.9200,-6.0000,0.0000,15.2847,1.7325,-4.3628,-7.3570,0.0135},
				{0.0200,31.9820,-5.5010,12.7382,1.9578,-7.4876,7.4770,14.0280,1.8000,-6.0000,0.0000,15.3175,1.6422,-4.5124,-7.4776,0.0106},
				{0.0200,32.0156,-5.5006,12.7745,1.8110,-7.3377,7.4925,14.0616,1.6800,-6.0000,0.0000,15.3485,1.5490,-4.6622,-7.4930,0.0081},
				{0.0200,32.0468,-5.5004,12.8078,1.6672,-7.1895,7.4106,14.0928,1.5600,-6.0000,0.0000,15.3776,1.4528,-4.8105,-7.4110,0.0062},
				{0.0200,32.0756,-5.5003,12.8383,1.5263,-7.0448,7.2391,14.1216,1.4400,-6.0000,0.0000,15.4046,1.3537,-4.9552,-7.2393,0.0046},
				{0.0200,32.1020,-5.5002,12.8661,1.3882,-6.9050,6.9854,14.1480,1.3200,-6.0000,0.0000,15.4297,1.2518,-5.0949,-6.9856,0.0033},
				{0.0200,32.1259,-5.5001,12.8912,1.2528,-6.7719,6.6569,14.1720,1.2000,-6.0000,0.0000,15.4526,1.1472,-5.2281,-6.6571,0.0023},
				{0.0200,32.1475,-5.5001,12.9136,1.1199,-6.6467,6.2606,14.1936,1.0800,-6.0000,0.0000,15.4734,1.0401,-5.3533,-6.2607,0.0016},
				{0.0200,32.1667,-5.5000,12.9333,0.9893,-6.5306,5.8034,14.2128,0.9600,-6.0000,0.0000,15.4920,0.9307,-5.4694,-5.8035,0.0011},
				{0.0200,32.1835,-5.5000,12.9506,0.8608,-6.4248,5.2919,14.2296,0.8400,-6.0000,0.0000,15.5084,0.8192,-5.5752,-5.2919,0.0007},
				{0.0200,32.1979,-5.5000,12.9652,0.7342,-6.3301,4.7327,14.2440,0.7200,-6.0000,0.0000,15.5225,0.7058,-5.6699,-4.7327,0.0004},
				{0.0200,32.2099,-5.5000,12.9774,0.6092,-6.2475,4.1321,14.2560,0.6000,-6.0000,0.0000,15.5344,0.5908,-5.7525,-4.1321,0.0002},
				{0.0200,32.2195,-5.5000,12.9871,0.4857,-6.1776,3.4963,14.2656,0.4800,-6.0000,0.0000,15.5438,0.4743,-5.8224,-3.4963,0.0001},
				{0.0200,32.2267,-5.5000,12.9944,0.3632,-6.1209,2.8315,14.2728,0.3600,-6.0000,0.0000,15.5510,0.3568,-5.8791,-2.8315,0.0001},
				{0.0200,32.2315,-5.5000,12.9992,0.2417,-6.0781,2.1437,14.2776,0.2400,-6.0000,0.0000,15.5557,0.2383,-5.9219,-2.1437,0.0001},
				{0.0200,32.2339,-5.5000,13.0017,0.1207,-6.0493,1.4386,14.2800,0.1200,-6.0000,0.0000,15.5581,0.1193,-5.9507,-1.4386,0.0000},
				{0.0200,32.2339,-5.5000,13.0017,0.0000,-6.0348,0.7222,14.2800,-0.0000,-6.0000,0.0000,15.5581,0.0000,-5.9652,-0.7222,0.0000},

	    };

	@Override
	public double[][] getPath() {
	    return points;
	}
}