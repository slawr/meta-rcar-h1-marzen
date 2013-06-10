# Find "files" directory
FILESEXTRAPATHS := "${THISDIR}/files"

# R-Car H1 BSP for Linux Kernel 3.4 Release v2.0 tag
SRCREV_rcar-h1-marzen = "4bae0421ee13fced563939035928af6368302b01"

SRC_URI = "git://github.com/slawr/u-boot.git;branch=edc-rcar-h1-k3.4;protocol=git \
	"
