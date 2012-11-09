FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

PR := "${PR}.1"

COMPATIBLE_MACHINE_rcar-h1-marzen = "rcar-h1-marzen"


KBRANCH_DEFAULT_rcar-h1-marzen  = "standard/arm-versatile-926ejs/rcar-h1-marzen"
KBRANCH_rcar-h1-marzen  = "${KBRANCH_DEFAULT}"

KMACHINE_rcar-h1-marzen  = "rcar-h1-marzen"

KERNEL_FEATURES_append_rcar-h1-marzen += " cfg/smp.scc"

SRC_URI += "file://rcar-h1-marzen-standard.scc \
            file://rcar-h1-marzen.scc \
            file://rcar-h1-marzen.cfg \
            file://user-config.cfg \
            file://user-patches.scc \
           "

# uncomment and replace these SRCREVs with the real commit ids once you've had
# the appropriate changes committed to the upstream linux-yocto repo
#SRCREV_machine_pn-linux-yocto_rcar-h1-marzen ?= "19f7e43b54aef08d58135ed2a897d77b624b320a"
#SRCREV_meta_pn-linux-yocto_rcar-h1-marzen ?= "459165c1dd61c4e843c36e6a1abeb30949a20ba7"
