# Android Benchmarks

This repository contains Android applications to work on ESBMC.

## Requirements

The following packages are needed:

- Android SDK: To compile the applications
- ESBMC compiled with Jimple Support
- Latest version of FlowDroid
- Latest version of Jimple2Json
- Java should be available on the PATH

## How to use:

1. Get the release build of the apk that you want to evaluate. In this case, we are going
     to use the bmc-reachability.apk

2. Use FlowDroid to extract the application into Jimple files

  a. Enter into FlowDroid directory: `$ cd FlowDroid`
  
  b. Call FlowDroid: `$ java -jar ./soot-infoflow-cmd-2.9.0-jar-with-dependencies.jar -a ../bmc-reachability.apk -p ../platforms -s ./SourcesAndSinks.txt -wj files`
     Note: Replace "../bmc-reachability.apk" as fit.
  
  c. After the analysis is finished, it will generate the "SootOutput" folder, where the jimple files can be used.


3. Convert a Jimple File into JSON
  
  a. Enter into Jimple2Json directory: `$ cd Jimple2Json`
  
  b. Run the binary with a jimple file: `$ .\jimple br.com.swperfi.bmc.MainActivity.jimple`
  
  c. Rename the file into a jimple file again: `$ mv br.com.swperfi.bmc.MainActivity.jimple.json main.jimple`

4. Run ESBMC
  
  a. Enter into ESBMC directory: `$ cd ESBMC\bin`
  
  b. Run esbmc with the file: `$ ./esbmc.exe ..\..\Example\main.jimple --function onCreate'$'lambda-0_2 --force-malloc-success --no-pointer-check`

  
     Please note the escape characters: in Windows to escape a character just wrap it using single quote '!!!!
	 Note: You can replace the "--function" as fit. For functions --goto-functions-only will list all available functions
  
