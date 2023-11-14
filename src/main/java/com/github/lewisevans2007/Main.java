/**
 * Platform
 * A CLI to get the platform of your system in Java.
 * GitHub: https://www.github.com/lewisevans2007/Platform
 * Licence: GNU General Public License v3.0
 * By: Lewis Evans
 */

package com.github.lewisevans2007;

public class Main {
    public static String getPlatform(){
        return System.getProperty("os.name");
    }
    public static int getPlatformCode(){
        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            return 0;
        }
        else if (System.getProperty("os.name").toLowerCase().contains("mac")) {
            return 1;
        }
        else if (System.getProperty("os.name").toLowerCase().contains("linux")) {
            return 2;
        }
        else{
            return 3;
        }
    }
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Usage: platform -sc");
            System.out.println("  -s: return as string in stdout");
            System.out.println("  -c: return as exit code");
            System.exit(1);
        }
        else{
            for(String arg: args){
                if(arg.equals("-s")){
                    System.out.println(getPlatform());
                }
                else if(arg.equals("-c")){
                    System.exit(getPlatformCode());
                }
                else{
                    System.out.println("Unknown argument: " + arg);
                }
            }
        }

    }
}