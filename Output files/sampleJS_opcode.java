public class sampleJS extends org.mozilla.javascript.NativeFunction implements org.mozilla.javascript.Script {
  public sampleJS(org.mozilla.javascript.Scriptable, org.mozilla.javascript.Context, int);
    Code:
       0: aload_0
       1: invokespecial #11
       4: aload_0
       5: iload_3
       6: putfield      #13
       9: aload_0
      10: aload_2
      11: aload_1
      12: invokespecial #17
      15: return
  public sampleJS();
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
       4: invokespecial #24
       7: aload_0
       8: invokestatic  #29
      11: return
  public final java.lang.Object exec(org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: dup
       4: aconst_null
       5: invokevirtual #35
       8: areturn
  public final java.lang.Object call(org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, org.mozilla.javascript.Scriptable, java.lang.Object[]);
    Code:
       0: aload_1
       1: invokestatic  #41
       4: ifne          17
       7: aload_0
       8: aload_1
       9: aload_2
      10: aload_3
      11: aload         4
      13: invokestatic  #45
      16: areturn
      17: aload_0
      18: aload_1
      19: aload_2
      20: aload_3
      21: aload         4
      23: aload_0
      24: getfield      #13
      27: tableswitch   {
                     1: 48
               default: 44
          }
      44: invokestatic  #49
      47: areturn
      48: invokestatic  #52
      51: areturn
  public int getLanguageVersion();
    Code:
       0: iconst_0
       1: ireturn
  public java.lang.String getFunctionName();
    Code:
       0: aload_0
       1: getfield      #13
       4: tableswitch   {
                     1: 27
               default: 24
          }
      24: ldc           #58
      26: areturn
      27: ldc           #60
      29: areturn
  public int getParamCount();
    Code:
       0: aload_0
       1: getfield      #13
       4: tableswitch   {
                     1: 26
               default: 24
          }
      24: iconst_0
      25: ireturn
      26: iconst_0
      27: ireturn
  public int getParamAndVarCount();
    Code:
       0: aload_0
       1: getfield      #13
       4: tableswitch   {
                     1: 26
               default: 24
          }
      24: iconst_4
      25: ireturn
      26: iconst_1
      27: ireturn
  public java.lang.String getParamOrVarName(int);
    Code:
       0: aload_0
       1: getfield      #13
       4: tableswitch   {
                     1: 64
               default: 24
          }
      24: iload_1
      25: tableswitch   {
                     1: 55
                     2: 58
                     3: 61
               default: 52
          }
      52: ldc           #66
      54: areturn
      55: ldc           #68
      57: areturn
      58: ldc           #70
      60: areturn
      61: ldc           #60
      63: areturn
      64: ldc           #70
      66: areturn
  public java.lang.String getEncodedSource();
    Code:
       0: ldc           #73                 
       2: aload_0
       3: getfield      #13
       6: tableswitch   {
                     1: 31
               default: 24
          }
      24: iconst_0
      25: bipush        81
      27: invokevirtual #79
      30: areturn
      31: bipush        35
      33: bipush        70
      35: invokevirtual #79
      38: areturn
  public boolean getParamOrVarConst(int);
    Code:
       0: aload_0
       1: getfield      #13
       4: tableswitch   {
                     1: 60
               default: 24
          }
      24: iload_1
      25: tableswitch   {
                     1: 54
                     2: 56
                     3: 58
               default: 52
          }
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
  static final {};
    Code:
       0: bipush        10
       2: invokestatic  #140
       5: putstatic     #105
       8: bipush        20
      10: invokestatic  #140
      13: putstatic     #112
      16: bipush        30
      18: invokestatic  #140
      21: putstatic     #123
      24: return
}