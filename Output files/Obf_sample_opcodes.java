public class Obf_sampleJS extends org.mozilla.javascript.NativeFunction implements org.mozilla.javascript.Script {
  public Obf_sampleJS(org.mozilla.javascript.Scriptable, org.mozilla.javascript.Context, int);
    Code:
       0: aload_0
       1: invokespecial #11
       4: aload_0
       5: iload_3
       6: putfield      #13
       9: aload_0
      10: aload_2
      11: aload_1
      12: iload_3
      13: tableswitch   {
                     2: 56
                     3: 60
                     4: 64
                     5: 68
                     6: 72
                     7: 76
               default: 52
          }
      52: invokespecial #17
      55: return
      56: invokespecial #20
      59: return
      60: invokespecial #23
      63: return
      64: invokespecial #26
      67: return
      68: invokespecial #29
      71: return
      72: invokespecial #32
      75: return
      76: invokespecial #35
      79: return
  public Obf_sampleJS();
    Code:
       0: aload_0
       1: invokespecial #11
       4: aload_0
       5: iconst_0
       6: putfield      #13
       9: return
  public static void main(java.lang.String[]);
    Code:
       0: new           #2
       3: dup
       4: invokespecial #42
       7: aload_0
       8: invokestatic  #47
      11: return
  public final java.lang.Object exec(org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: dup
       4: aconst_null
       5: invokevirtual #53
       8: areturn
  public final java.lang.Object call(org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, org.mozilla.javascript.Scriptable, java.lang.Object[]);
    Code:
       0: aload_1
       1: invokestatic  #59
       4: ifne          17
       7: aload_0
       8: aload_1
       9: aload_2
      10: aload_3
      11: aload         4
      13: invokestatic  #63
      16: areturn
      17: aload_0
      18: aload_1
      19: aload_2
      20: aload_3
      21: aload         4
      23: aload_0
      24: getfield      #13
      27: tableswitch   {
                     1: 72
                     2: 76
                     3: 80
                     4: 84
                     5: 88
                     6: 92
                     7: 96
               default: 68
          }
      68: invokestatic  #67
      71: areturn
      72: invokestatic  #70
      75: areturn
      76: invokestatic  #73
      79: areturn
      80: invokestatic  #76
      83: areturn
      84: invokestatic  #79
      87: areturn
      88: invokestatic  #82
      91: areturn
      92: invokestatic  #85
      95: areturn
      96: invokestatic  #88
      99: areturn
  public int getLanguageVersion();
    Code:
       0: iconst_0
       1: ireturn
  public java.lang.String getFunctionName();
    Code:
       0: aload_0
       1: getfield      #13
       4: tableswitch   {
                     1: 51
                     2: 54
                     3: 57
                     4: 60
                     5: 63
                     6: 66
                     7: 69
               default: 48
          }
      48: ldc           #94
      50: areturn
      51: ldc           #96
      53: areturn
      54: ldc           #96
      56: areturn
      57: ldc           #96
      59: areturn
      60: ldc           #98
      62: areturn
      63: ldc           #96
      65: areturn
      66: ldc           #96
      68: areturn
      69: ldc           #96
      71: areturn
  public int getParamCount();
    Code:
       0: aload_0
       1: getfield      #13
       4: tableswitch   {
                     1: 50
                     2: 52
                     3: 54
                     4: 56
                     5: 58
                     6: 60
                     7: 62
               default: 48
          }
      48: iconst_0
      49: ireturn
      50: iconst_0
      51: ireturn
      52: iconst_0
      53: ireturn
      54: iconst_0
      55: ireturn
      56: iconst_0
      57: ireturn
      58: iconst_0
      59: ireturn
      60: iconst_0
      61: ireturn
      62: iconst_0
      63: ireturn
  public int getParamAndVarCount();
    Code:
       0: aload_0
       1: getfield      #13
       4: tableswitch   {
                     1: 50
                     2: 52
                     3: 54
                     4: 56
                     5: 58
                     6: 60
                     7: 62
               default: 48
          }
      48: iconst_5
      49: ireturn
      50: iconst_0
      51: ireturn
      52: iconst_0
      53: ireturn
      54: iconst_0
      55: ireturn
      56: iconst_2
      57: ireturn
      58: iconst_0
      59: ireturn
      60: iconst_0
      61: ireturn
      62: iconst_0
      63: ireturn
  public java.lang.String getParamOrVarName(int);
    Code:
       0: aload_0
       1: getfield      #13
       4: tableswitch   {
                     1: 95
                     2: 97
                     3: 99
                     4: 101
                     5: 126
                     6: 128
                     7: 130
               default: 48
          }
      48: iload_1
      49: tableswitch   {
                     1: 83
                     2: 86
                     3: 89
                     4: 92
               default: 80
          }
      80: ldc           #104
      82: areturn
      83: ldc           #96
      85: areturn
      86: ldc           #106
      88: areturn
      89: ldc           #108
      91: areturn
      92: ldc           #98
      94: areturn
      95: aconst_null
      96: areturn
      97: aconst_null
      98: areturn
      99: aconst_null
     100: areturn
     101: iload_1
     102: tableswitch   {
                     1: 123
               default: 120
          }
     120: ldc           #96
     122: areturn
     123: ldc           #110
     125: areturn
     126: aconst_null
     127: areturn
     128: aconst_null
     129: areturn
     130: aconst_null
     131: areturn
  public java.lang.String getEncodedSource();
    Code:
       0: ldc           #113                
       2: aload_0
       3: getfield      #13
       6: tableswitch   {
                     1: 56
                     2: 64
                     3: 72
                     4: 80
                     5: 89
                     6: 97
                     7: 107
               default: 48
          }
      48: iconst_0
      49: sipush        177
      52: invokevirtual #119
      55: areturn
      56: bipush        12
      58: bipush        24
      60: invokevirtual #119
      63: areturn
      64: bipush        37
      66: bipush        49
      68: invokevirtual #119
      71: areturn
      72: bipush        69
      74: bipush        81
      76: invokevirtual #119
      79: areturn
      80: bipush        83
      82: sipush        151
      85: invokevirtual #119
      88: areturn
      89: bipush        104
      91: bipush        116
      93: invokevirtual #119
      96: areturn
      97: sipush        136
     100: sipush        148
     103: invokevirtual #119
     106: areturn
     107: sipush        163
     110: sipush        175
     113: invokevirtual #119
     116: areturn
  public boolean getParamOrVarConst(int);
    Code:
       0: aload_0
       1: getfield      #13
       4: tableswitch   {
                     1: 90
                     2: 92
                     3: 94
                     4: 96
                     5: 120
                     6: 122
                     7: 124
               default: 48
          }
      48: iload_1
      49: tableswitch   {
                     1: 82
                     2: 84
                     3: 86
                     4: 88
               default: 80
          }
      80: iconst_0
      81: ireturn
      82: iconst_0
      83: ireturn
      84: iconst_0
      85: ireturn
      86: iconst_0
      87: ireturn
      88: iconst_0
      89: ireturn
      90: iconst_0
      91: ireturn
      92: iconst_0
      93: ireturn
      94: iconst_0
      95: ireturn
      96: iload_1
      97: tableswitch   {
                     1: 118
               default: 116
          }
     116: iconst_0
     117: ireturn
     118: iconst_0
     119: ireturn
     120: iconst_0
     121: ireturn
     122: iconst_0
     123: ireturn
     124: iconst_0
     125: ireturn
  static final {};
    Code:
       0: bipush        20
       2: invokestatic  #207
       5: putstatic     #145
       8: bipush        10
      10: invokestatic  #207
      13: putstatic     #152
      16: bipush        30
      18: invokestatic  #207
      21: putstatic     #167
      24: return
}