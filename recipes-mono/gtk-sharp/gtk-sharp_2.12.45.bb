require gtk-sharp.inc

inherit pkgconfig

DEPENDS += " gtk+ atk pango cairo glib-2.0"

LIC_FILES_CHKSUM = "file://COPYING;md5=7fbc338309ac38fefcd64b04bb903e34"

SRC_URI[md5sum] = "48cdd0292229eba58b403930032fb766"
SRC_URI[sha256sum] = "02680578e4535441064aac21d33315daa009d742cab8098ac8b2749d86fffb6a"

SEXT = "gz"
