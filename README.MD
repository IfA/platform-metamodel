# Platform Metamodel 

A generic, extensible, [EMF][]-based platofrm modeling language for the *Model-based Development of User Interfaces* (MBUID) that was developed during the DFG project *KonTrans - Kontextabhängige Transformationsmodelle* (Context-dependent Transformation Models) that was conducted at [Institute of Automation at TU Dresden](http://www.et.tu-dresden.de/ifa).

## Installation

### User Setup

If you just want to use the metamodel as is in order to define/specify platform models, you can install the current version into your Eclipse instance via the [Update Site].

Note: This update site is only available from within the campus network of TU Dresden! If you have no possibility to connect to this network, you need to clone the repository and install the feature manually.

### Development Setup

If you want to extend the platform metamodel or the associated tools, you should make use of the [Setup File] for the [Eclipse Installer] that will automatically:

 * Install all required Eclipse features
 * Clone this Git repository
 * Import all projects
 * Add the imported projects to working sets
 * Adjust a couple of settings in the Eclipse installation

In order to execute the installer, perform the following steps:

 * Download and execute the [Eclipse Installer]
 * Switch to the *Advanced Mode* (via the hamburger icon at the upper right of the installer)
 * Choose the *Eclipse Modeling Tools* version (any other version should work as well)
 * Add the *Platform* project by 
    * clicking the small, green '**+**' icon, 
    * entering the URL of the Setup File ([https://agtele.eats.et.tu-dresden.de/eclipse/setups/Platform.setup][Setup File]),
    * confirming with *OK* and 
    * selecting the new project with a *double click*
 * Specify the relevant variables on the next screen (especially the install and clone locations)
 * Execute the installer

 After the installer finished successfully, you should be good to go...

## Sub-Projects

*  The **Feature Project** contains an Eclipse feature for the platform metamodel that can be installed into an Eclipse instance.
*  The **Model Project** defines the core language model of the modeling language, i.e. the [EMF][]-based metamodel.
*  The **Edit Project** provides edit support for platform models.
*  The **Update Site Project** provides the Eclispe update site definition in order to build the installable plugins using the feature project.
*  The **Setup Project** provides the setup file that allows a quick start for developers by using the Eclipse Installer.

## Related Projects

### PAMTraM

The PAMTraM project provides a modeling workbench that allows developing and running model-to-model transformations between arbitrary source and target modeling languages. It was developed as part of the same research project as the platform metamodel.

See [PAMTraM Project](https://git.agtele.eats.et.tu-dresden.de/agtele/de.mfreund.pamtram)

[EMF]: https://www.eclipse.org/modeling/emf/
[Eclipse Installer]: https://www.eclipse.org/downloads/eclipse-packages/
[Update Site]: https://agtele.eats.et.tu-dresden.de/eclipse/updates/
[Setup File]: https://agtele.eats.et.tu-dresden.de/eclipse/setups/Platform.setup