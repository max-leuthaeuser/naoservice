# -*- coding: utf-8 -*-
"""
Copyright (c) 2011, Max Leuthaeuser
License: GPL (see LICENSE.txt for details)
"""

__author__ = 'Max Leuthaeuser'
__license__ = 'GPL'

from JavaInterfaceMethod import JavaInterfaceMethod
from JavaClass import JavaClass, ClassType
from JavaTypes import JavaTypes
from JavaModifier import JavaModifier
from JavaMethod import JavaMethod
from JavaVariable import JavaVariable
from JavaAbstractMethod import JavaAbstractMethod

# testing area

# =============================================================================
# methods
javadoc = "/**\n * some javadoc here {@note testing}\n */"
jv = JavaVariable("arg", JavaTypes.STRINGARR, modifier=[JavaModifier.FINAL])
jo = JavaVariable("o", JavaTypes.OBJECT, modifier=[JavaModifier.FINAL])
jm_a = JavaMethod("toString", "return \"test\";", JavaTypes.STRING, [JavaModifier.PUBLIC], [jv], javadoc)
jm_no_jd = JavaInterfaceMethod("toString", JavaTypes.STRING, arguments=[jv], throws=["NullPointerException"])
print "Standard JavaMethod:"
print jm_a.string_repr(1)

jam = JavaAbstractMethod("equals", JavaTypes.BOOL, [JavaModifier.PUBLIC, JavaModifier.STATIC], [jv, jv], javadoc)
print "\nAbstract JavaMethod:"
print jam.string_repr(1)

jim = JavaInterfaceMethod("compare", JavaTypes.INT, arguments=[jo, jv, jo], javadoc=javadoc, throws=["IllegalArgumentException", "NullPointerException"])
print "\nInterface JavaMethod:"
print jim.string_repr(1)
# =============================================================================

# =============================================================================
# classes

# some interfaces
interface_a = (JavaClass.JavaBuilder("InterfaceA", [JavaModifier.PUBLIC])
    .class_type(ClassType.INTERFACE)
    .methods([jim, jm_no_jd, jim])
    .javadoc(javadoc)
    .build())
print "\nInterface A:"
print interface_a.string_repr(0)

interface_b = (JavaClass.JavaBuilder("InterfaceB", [])
    .class_type(ClassType.INTERFACE)
    .methods([jim])
    .javadoc(javadoc)
    .base_classes([interface_a, interface_a])
    .build())
print "\nInterface B:"
print interface_b.string_repr(1)

# a library class
lib_class = JavaClass.JavaBuilder("Set", []).build()

# a class variable
var_class_a = JavaVariable("name_a", JavaTypes.STRING, modifier=[JavaModifier.PRIVATE, JavaModifier.VOLATILE])
var_class_b = JavaVariable("name_b", JavaTypes.FLOAT, modifier=[JavaModifier.PRIVATE, JavaModifier.STATIC], value="0.2", javadoc=javadoc)

# an abstract class
ab_class = (JavaClass.JavaBuilder("AbstractClass", [JavaModifier.PUBLIC, JavaModifier.ABSTRACT])
    .base_classes([lib_class, interface_a, interface_b])
    .variables([var_class_a, var_class_b])
    .methods([jm_a, jam])
    .javadoc(javadoc)
    .build())
print "\nAbstract Class:"
print ab_class.string_repr(1)

baseclass_a = JavaClass.JavaBuilder("BaseClassA", []).class_type(ClassType.CLASS).build()
baseclass_b = JavaClass.JavaBuilder("BaseClassB", [JavaModifier.PRIVATE, JavaModifier.STATIC]).class_type(ClassType.CLASS).build()

javadoc = "/**\n * another javadoc comment...\n */"
jv_a = JavaVariable("arg", JavaTypes.STRINGARR, modifier=[JavaModifier.FINAL])
jv_b = JavaVariable("o", JavaTypes.OBJECT)
jm_b = JavaMethod("toString", "return \"test\";", JavaTypes.STRING, [JavaModifier.PUBLIC], [jv_a, jv_b], javadoc)      

# a class with nested inner classes
s_class = (JavaClass.JavaBuilder("SameSpecialClass", [JavaModifier.PUBLIC])
    .base_classes([baseclass_a])
    .variables([var_class_a])
    .methods([jm_a, jm_b, jam])
    .inner_classes([baseclass_b, ab_class])
    .javadoc(javadoc)
    .build())

print "\Class with some inner classes:"
print s_class.string_repr(0)

# =============================================================================