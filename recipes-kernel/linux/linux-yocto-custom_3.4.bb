DESCRIPTION = "Linux mainline kernel for Renesas R-Car H1 family"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"
# DEPENDS += "lzop-native"

inherit kernel
require recipes-kernel/linux/linux-yocto.inc

COMPATIBLE_MACHINE = "rcar-h1-marzen"

KERNEL_IMAGETYPE = "uImage"

PR = "r1"

# Enable this line if you wish to build a kernel compliant with Genivi (www.genivi.org)
#require genivi-requirements.inc

# R-Car H1 BSP for Linux Kernel 3.4 Release v2.0 tag
SRCREV_rcar-h1-marzen = "af52476d57a694a4a9fd67733cde9879cffc9bad"

SRC_URI = "git://github.com/slawr/linux-stable.git;branch=edc-rcar-h1-marzen-v3.4;protocol=git \
	file://defconfig \
	"

S = "${WORKDIR}/git"
# Workaround for Yocto issue not yet in mainline
#S = "${WORKDIR}/git-dir"

# We need to pass it as param since kernel might support more then one
# machine, with different entry points
EXTRA_OEMAKE += "LOADADDR=${UBOOT_ENTRYPOINT}"

